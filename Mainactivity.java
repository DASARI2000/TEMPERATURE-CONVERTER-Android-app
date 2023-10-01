package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import com.example.myapplication.R;
public class MainActivity extends AppCompatActivity {
private EditText inputTemp, outputTemp;
private RadioButton celsiusButton, fahrenheitButton;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
// Get references to UI elements
inputTemp = findViewById(R.id.input_temp);
outputTemp = findViewById(R.id.output_temp);
celsiusButton = findViewById(R.id.celsius_button);
fahrenheitButton = findViewById(R.id.fahrenheit_button);
}
public void convertTemperature(View view) {
String inputText = inputTemp.getText().toString();
if (inputText.isEmpty()) {
Toast.makeText(this, "Please enter a temperature",
Toast.LENGTH_SHORT).show();
return;
}
double inputTemperature = Double.parseDouble(inputText);
double outputTemperature;
if (celsiusButton.isChecked()) {
// Convert from Celsius to Fahrenheit
outputTemperature = (inputTemperature * 1.8) + 32;
} else {
// Convert from Fahrenheit to Celsius
outputTemperature = (inputTemperature - 32) / 1.8;
}
outputTemp.setText(String.format("%.2f", outputTemperature));
}
}
