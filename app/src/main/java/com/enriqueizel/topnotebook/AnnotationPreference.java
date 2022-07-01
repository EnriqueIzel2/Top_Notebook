package com.enriqueizel.topnotebook;

import android.content.Context;
import android.content.SharedPreferences;

public class AnnotationPreference {
  private Context context;
  private SharedPreferences preferences;
  private SharedPreferences.Editor editor;

  private final String FILE_NAME = "annotation.preferences";

  public AnnotationPreference(Context context) {
    this.context = context;
    preferences = context.getSharedPreferences(FILE_NAME, 0);
    editor = preferences.edit();
  }

  public void saveAnnotation(){}

  public void getAnnotation(){}
}
