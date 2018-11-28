package com.greenfoxacademy.languagelevels.Service;

import com.greenfoxacademy.languagelevels.Model.ApprenticeRepository;
import com.greenfoxacademy.languagelevels.Model.LanguageRepository;
import com.greenfoxacademy.languagelevels.Model.LevelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
