package com.enriqueizel.topnotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
  private AnnotationPreference preference;
  private EditText editAnnotation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    FloatingActionButton btnCheck = findViewById(R.id.btn_check);
    editAnnotation = findViewById(R.id.edit_annotation);

    preference = new AnnotationPreference(getApplicationContext());

    btnCheck.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String retrievedText = editAnnotation.getText().toString();

        if (retrievedText.isEmpty()) {
          Toast.makeText(getApplicationContext(), "Preencha a anotação", Toast.LENGTH_SHORT)
                  .show();
        } else {
          preference.saveAnnotation(retrievedText);
          Toast.makeText(getApplicationContext(), "Anotação salva com sucesso", Toast.LENGTH_SHORT)
                  .show();
        }
      }
    });
  }
}