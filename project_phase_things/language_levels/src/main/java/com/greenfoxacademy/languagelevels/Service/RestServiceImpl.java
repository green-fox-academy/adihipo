package com.greenfoxacademy.languagelevels.Service;

import com.greenfoxacademy.languagelevels.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    return apprenticeRepository.findAllFilteredWEB(searchTerms);
  }
}
