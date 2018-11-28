package com.greenfoxacademy.languagelevels.Service;

import com.greenfoxacademy.languagelevels.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestServiceImpl implements RestService {

  private ApprenticeRepository apprenticeRepository;
  private LanguageRepository languageRepository;
  private LevelRepository levelRepository;

  @Autowired
  public RestServiceImpl(ApprenticeRepository apprenticeRepository, LanguageRepository languageRepository, LevelRepository levelRepository) {
    this.apprenticeRepository = apprenticeRepository;
    this.languageRepository = languageRepository;
    this.levelRepository = levelRepository;
  }

  @Override
  public List<Apprentice> getAllApprentices() {
    return apprenticeRepository.findAll();
  }

  @Override
  public List<Apprentice> getAllFilteredApprentices() {
    return apprenticeRepository.findAllFiltered();
  }

  @Override
  public List<Language> getAllLanguages() {
    return languageRepository.findAll();
  }

  @Override
  public List<Level> getAllLevels() {
    return levelRepository.findAll();
  }

  @Override
  public List<Apprentice> getAllFilteredApprenticesWEB(SearchTerms searchTerms) {
    String[] languages = getLanguagesWithLevelValuesFromSearchTermsToFiltering(searchTerms);
    return apprenticeRepository.findAllFilteredWEB(languages);
  }

  private String[] getLanguagesWithLevelValuesFromSearchTermsToFiltering(SearchTerms searchTerms) {
    if (searchTerms.getLanguages() != null) {
      List<String> languagesWithLevels = Arrays.asList(searchTerms.getLanguages());
      List<String> stringsToFilter = new ArrayList<>();
      int max = levelRepository.findAll().size();
      for (int i = 0; i < languagesWithLevels.size(); i++) {
        int currentLanguageLevelValue = languagesWithLevels.get(i).charAt(languagesWithLevels.size() - 1);
        String currentLanguageName = languagesWithLevels.get(i).substring(0, languagesWithLevels.get(i).length() - 2);
        for (int j = currentLanguageLevelValue; j <= max; j++) {
          stringsToFilter.add(currentLanguageName + j);
        }
      }
      String[] arr = new String[stringsToFilter.size()];
      arr = stringsToFilter.toArray(arr);
      return arr;
    }
    return null;
  }
}
