package com.greenfoxacademy.languagelevels.Service;

import com.greenfoxacademy.languagelevels.Model.Apprentice;
import com.greenfoxacademy.languagelevels.Model.Language;
import com.greenfoxacademy.languagelevels.Model.Level;
import com.greenfoxacademy.languagelevels.Model.SearchTerms;

import java.util.List;

public interface RestService {

  List<Apprentice> getAllApprentices();
  List<Apprentice> getAllFilteredApprentices();
  List<Language> getAllLanguages();
  List<Level> getAllLevels();
  List<Apprentice> getAllFilteredApprenticesWEB(SearchTerms searchTerms);
}
