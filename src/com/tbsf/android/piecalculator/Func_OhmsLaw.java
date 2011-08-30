package com.tbsf.android.piecalculator;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.text.*;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

public class Func_OhmsLaw extends Activity {

    protected EditText PIE_P;
    protected EditText PIE_I;
    protected EditText PIE_E;
    protected EditText VIR_V;
    protected EditText VIR_I;
    protected EditText VIR_R;
    
    public static int LastEdit_PIE;
    public static int LastEdit_VIR;
    
    public static final int c_PIE_P = 0; 
    public static final int c_PIE_I = 1; 
    public static final int c_PIE_E = 2; 
    public static final int c_VIR_V = 0; 
    public static final int c_VIR_I = 1;
    public static final int c_VIR_R = 2; 
    
    public ArrayList<EditText> PIEVals;
    public ArrayList<EditText> VIRVals;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.func_ohmslaw);
        
        PIEVals = new ArrayList<EditText>();
        VIRVals = new ArrayList<EditText>();
        
        LastEdit_PIE = -1;
        LastEdit_VIR = -1;

        //Get EditText references
        PIEVals.add(c_PIE_P, (EditText)findViewById(R.id.pie_p));
        PIEVals.add(c_PIE_I, (EditText)findViewById(R.id.pie_i));
        PIEVals.add(c_PIE_E, (EditText)findViewById(R.id.pie_e));
        VIRVals.add(c_VIR_V, (EditText)findViewById(R.id.vir_v));
        VIRVals.add(c_VIR_I, (EditText)findViewById(R.id.vir_i));
        VIRVals.add(c_VIR_R, (EditText)findViewById(R.id.vir_r));
        /*PIE_I = (EditText)findViewById(R.id.pie_i);
        PIE_E = (EditText)findViewById(R.id.pie_e);
        VIR_V = (EditText)findViewById(R.id.vir_v);
        VIR_I = (EditText)findViewById(R.id.vir_i);
        VIR_R = (EditText)findViewById(R.id.vir_r);*/
        
        /*********************************************************************************/
        /*** BEGIN TextChangedListener functions ******************************************/
        /*********************************************************************************/
        
        /*
         ************ 	pie_p EditText Box
         */
        ((EditText)findViewById(R.id.pie_p)).addTextChangedListener(new TextWatcher() {
        	 
            public void afterTextChanged(Editable s) {
            	if(s.toString().trim() == "" && LastEdit_PIE == c_PIE_P) {
            		LastEdit_PIE = -1;
            		return;
            	}
            	if(LastEdit_PIE == -1) { 
            		LastEdit_PIE = c_PIE_P;
            	}
            	if(LastEdit_PIE == -2) { 
            		LastEdit_PIE = -1;
            	} 
            }
         
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
         
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	PIEVals.get(c_PIE_P).setTextColor(Color.BLACK);
            	PIEVals.get(c_PIE_I).setTextColor(Color.BLACK);
            	PIEVals.get(c_PIE_E).setTextColor(Color.BLACK);
            }
         
        });
        
        // OnKeyListener Fuction
        
        ((EditText)findViewById(R.id.pie_p)).setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                	if(PIEVals.get(c_PIE_P).getText().toString().trim() != "") {
                		doPIEMath(c_PIE_P);
                		return true;
                	}
                }
                return false;
            }
        });
        
        /*
         ************ 	pie_i EditText Box
         */
        ((EditText)findViewById(R.id.pie_i)).addTextChangedListener(new TextWatcher() {
        	 
            public void afterTextChanged(Editable s) {
            	if(s.toString().trim() == "" && LastEdit_PIE == c_PIE_I) {
            		LastEdit_PIE = -1;
            		return;
            	}
            	if(LastEdit_PIE == -1) { 
            		LastEdit_PIE = c_PIE_I;
            	}
            	if(LastEdit_PIE == -2) { 
            		LastEdit_PIE = -1;
            	} 
            }
         
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
         
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	PIEVals.get(c_PIE_P).setTextColor(Color.BLACK);
            	PIEVals.get(c_PIE_I).setTextColor(Color.BLACK);
            	PIEVals.get(c_PIE_E).setTextColor(Color.BLACK);
            }
         
        });
        
        // OnKeyListener Fuction
        
        ((EditText)findViewById(R.id.pie_i)).setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                	if(PIEVals.get(c_PIE_I).getText().toString().trim() != "") {
                		doPIEMath(c_PIE_I);
                		return true;
                	}
                }
                return false;
            }
        });
       
        /*
         ************ 	pie_e EditText Box
         */
        ((EditText)findViewById(R.id.pie_e)).addTextChangedListener(new TextWatcher() {
        	 
            public void afterTextChanged(Editable s) {
            	if(s.toString().trim() == "" && LastEdit_PIE == c_PIE_E) {
            		LastEdit_PIE = -1;
            		return;
            	}
            	if(LastEdit_PIE == -1) { 
            		LastEdit_PIE = c_PIE_E;
            	}
            	if(LastEdit_PIE == -2) { 
            		LastEdit_PIE = -1;
            	} 
            }
         
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
         
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	PIEVals.get(c_PIE_P).setTextColor(Color.BLACK);
            	PIEVals.get(c_PIE_I).setTextColor(Color.BLACK);
            	PIEVals.get(c_PIE_E).setTextColor(Color.BLACK);
            }
         
        });
        
        // OnKeyListener Fuction
        
        ((EditText)findViewById(R.id.pie_e)).setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                	if(PIEVals.get(c_PIE_E).getText().toString().trim() != "") {
                		doPIEMath(c_PIE_E);
                		return true;
                	}
                }
                return false;
            }
        });
       
        /*
         ************ 	vir_v EditText Box
         */
        ((EditText)findViewById(R.id.vir_v)).addTextChangedListener(new TextWatcher() {
            
        	public void afterTextChanged(Editable s) {
            	if(s.toString().trim() == "" && LastEdit_VIR == c_VIR_V) {
            		LastEdit_VIR = -1;
            		return;
            	}
            	if(LastEdit_VIR == -1) { 
            		LastEdit_VIR = c_VIR_V;
            	}
            	if(LastEdit_VIR == -2) { 
            		LastEdit_VIR = -1;
            	} 
            }
         
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
         
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	VIRVals.get(c_VIR_V).setTextColor(Color.BLACK);
            	VIRVals.get(c_VIR_I).setTextColor(Color.BLACK);
            	VIRVals.get(c_VIR_R).setTextColor(Color.BLACK);
            }
         
        });
        
        // OnKeyListener Fuction
        
        ((EditText)findViewById(R.id.vir_v)).setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                	if(VIRVals.get(c_VIR_V).getText().toString().trim() != "") {
                		doVIRMath(c_VIR_V);
                		return true;
                	}
                }
                return false;
            }
        });
       
        /*
         ************ 	vir_i EditText Box
         */
        ((EditText)findViewById(R.id.vir_i)).addTextChangedListener(new TextWatcher() {
        	 
        	public void afterTextChanged(Editable s) {
            	if(s.toString().trim() == "" && LastEdit_VIR == c_VIR_I) {
            		LastEdit_VIR = -1;
            		return;
            	}
            	if(LastEdit_VIR == -1) { 
            		LastEdit_VIR = c_VIR_I;
            	}
            	if(LastEdit_VIR == -2) { 
            		LastEdit_VIR = -1;
            	} 
            }
         
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
         
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	VIRVals.get(c_VIR_V).setTextColor(Color.BLACK);
            	VIRVals.get(c_VIR_I).setTextColor(Color.BLACK);
            	VIRVals.get(c_VIR_R).setTextColor(Color.BLACK);
            }
         
        });
        
        // OnKeyListener Fuction
        
        ((EditText)findViewById(R.id.vir_i)).setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                	if(VIRVals.get(c_VIR_I).getText().toString().trim() != "") {
                		doVIRMath(c_VIR_I);
                		return true;
                	}
                }
                return false;
            }
        });
        
        /*
         ************ 	vir_r EditText Box
         */
        ((EditText)findViewById(R.id.vir_r)).addTextChangedListener(new TextWatcher() {
        	 
        	public void afterTextChanged(Editable s) {
            	if(s.toString().trim() == "" && LastEdit_VIR == c_VIR_R) {
            		LastEdit_VIR = -1;
            		return;
            	}
            	if(LastEdit_VIR == -1) { 
            		LastEdit_VIR = c_VIR_R;
            	}
            	if(LastEdit_VIR == -2) { 
            		LastEdit_VIR = -1;
            	} 
            }
         
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }
         
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            	VIRVals.get(c_VIR_V).setTextColor(Color.BLACK);
            	VIRVals.get(c_VIR_I).setTextColor(Color.BLACK);
            	VIRVals.get(c_VIR_R).setTextColor(Color.BLACK);
            }
         
        });
        
        // OnKeyListener Fuction
        
        ((EditText)findViewById(R.id.vir_r)).setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                	if(VIRVals.get(c_VIR_R).getText().toString().trim() != "") {
                		doVIRMath(c_VIR_R);
                		return true;
                	}
                }
                return false;
            }
        });
    }
    
    public void doPIEMath(int curEdit)
    {	
    	float ans;
		float p,i,e;
    	
    	if(curEdit != LastEdit_PIE && LastEdit_PIE >= 0) {
        	switch(curEdit) {
        		
        		case c_PIE_P:
        			if(LastEdit_PIE == c_PIE_I) {
        				//ans = (Str2Float(PIEVals.get(c_PIE_P).getText().toString()) / Str2Float(PIEVals.get(c_PIE_I).getText().toString()));
        				p = Str2Float(c_PIE_P, true);
        				i = Str2Float(c_PIE_I, true);
        				if(p > 0 && i > 0) {
            				ans = p / i;
            				LastEdit_PIE = -2;
            				PIEVals.get(c_PIE_E).setText(Float.toString(ans));
            				PIEVals.get(c_PIE_E).setTextColor(Color.GREEN);
        				}
        			}
        			if(LastEdit_PIE == c_PIE_E) {
        				p = Str2Float(c_PIE_P, true);
        				e = Str2Float(c_PIE_E, true);
        				if(p > 0 && e > 0) {
            				ans = p / e;
            				LastEdit_PIE = -2;
            				PIEVals.get(c_PIE_I).setText(Float.toString(ans));
            				PIEVals.get(c_PIE_I).setTextColor(Color.GREEN);
            			}	
        			}
        			break;
        			
        		case c_PIE_I:
        			if(LastEdit_PIE == c_PIE_P) {
        				p = Str2Float(c_PIE_P, true);
        				i = Str2Float(c_PIE_I, true);
        				if(p >= 0 && i > 0) {
            				ans = p / i;
            				LastEdit_PIE = -2;
            				PIEVals.get(c_PIE_E).setText(Float.toString(ans));
            				PIEVals.get(c_PIE_E).setTextColor(Color.GREEN);
        				}
        			}
        			if(LastEdit_PIE == c_PIE_E) {
        				i = Str2Float(c_PIE_I, true);
        				e = Str2Float(c_PIE_E, true);
        				if(i >= 0 && e >= 0) {
            				ans = i * e;
            				LastEdit_PIE = -2;
            				PIEVals.get(c_PIE_P).setText(Float.toString(ans));
            				PIEVals.get(c_PIE_P).setTextColor(Color.GREEN);
        				}	
        			}
        			break;
        			
        		case c_PIE_E:
        			if(LastEdit_PIE == c_PIE_I) {
        				e = Str2Float(c_PIE_E, true);
        				i = Str2Float(c_PIE_I, true);
        				if(e >= 0 && i >= 0) {
            				ans = e * i;
            				LastEdit_PIE = -2;
            				PIEVals.get(c_PIE_P).setText(Float.toString(ans));
            				PIEVals.get(c_PIE_P).setTextColor(Color.GREEN);
        				}
        			}
        			if(LastEdit_PIE == c_PIE_P) {
        				p = Str2Float(c_PIE_P, true);
        				e = Str2Float(c_PIE_E, true);
        				if(e > 0 && p >= 0) {
            				ans = p / e;
            				LastEdit_PIE = -2;
            				PIEVals.get(c_PIE_I).setText(Float.toString(ans));
            				PIEVals.get(c_PIE_I).setTextColor(Color.GREEN);
        				}
        			}
        			break;
        			
        		default:
        			break;
        	}
    	}
    	
    }
    
    public void doVIRMath(int curEdit)
    {	
    	float ans;
		float v,i,r;
    	
    	if(curEdit != LastEdit_VIR && LastEdit_VIR >= 0) {
        	switch(curEdit) {
        		
        		case c_VIR_V:
        			if(LastEdit_VIR == c_VIR_I) {
        				v = Str2Float(c_VIR_V, false);
        				i = Str2Float(c_VIR_I, false);
        				if(v > 0 && i > 0) {
            				ans = v / i;
            				LastEdit_VIR = -2;
            				VIRVals.get(c_VIR_R).setText(Float.toString(ans));
            				VIRVals.get(c_VIR_R).setTextColor(Color.GREEN);
        				}
        			}
        			if(LastEdit_VIR == c_VIR_R) {
        				v = Str2Float(c_VIR_V, false);
        				r = Str2Float(c_VIR_R, false);
        				if(v > 0 && r > 0) {
            				ans = v / r;
            				LastEdit_VIR = -2;
            				VIRVals.get(c_VIR_I).setText(Float.toString(ans));
            				VIRVals.get(c_VIR_I).setTextColor(Color.GREEN);
            			}	
        			}
        			break;
        			
        		case c_VIR_I:
        			if(LastEdit_VIR == c_VIR_V) {
        				v = Str2Float(c_VIR_V, false);
        				i = Str2Float(c_VIR_I, false);
        				if(v >= 0 && i > 0) {
            				ans = v / i;
            				LastEdit_VIR = -2;
            				VIRVals.get(c_VIR_R).setText(Float.toString(ans));
            				VIRVals.get(c_VIR_R).setTextColor(Color.GREEN);
        				}
        			}
        			if(LastEdit_VIR == c_VIR_R) {
        				i = Str2Float(c_VIR_I, false);
        				r = Str2Float(c_VIR_R, false);
        				if(i >= 0 && r >= 0) {
            				ans = i * r;
            				LastEdit_VIR = -2;
            				VIRVals.get(c_VIR_V).setText(Float.toString(ans));
            				VIRVals.get(c_VIR_V).setTextColor(Color.GREEN);
        				}	
        			}
        			break;
        			
        		case c_VIR_R:
        			if(LastEdit_VIR == c_VIR_I) {
        				r = Str2Float(c_VIR_R, false);
        				i = Str2Float(c_VIR_I, false);
        				if(r >= 0 && i >= 0) {
            				ans = r * i;
            				LastEdit_VIR = -2;
            				VIRVals.get(c_VIR_V).setText(Float.toString(ans));
            				VIRVals.get(c_VIR_V).setTextColor(Color.GREEN);
        				}
        			}
        			if(LastEdit_VIR == c_VIR_V) {
        				v = Str2Float(c_VIR_V, false);
        				r = Str2Float(c_VIR_R, false);
        				if(r > 0 && v >= 0) {
            				ans = v / r;
            				LastEdit_VIR = -2;
            				VIRVals.get(c_VIR_I).setText(Float.toString(ans));
            				VIRVals.get(c_VIR_I).setTextColor(Color.GREEN);
        				}
        			}
        			break;
        			
        		default:
        			break;
        	}
    	}
    	
    }
    
    public float Str2Float(int txtBox, boolean PIE) {
    	float f;
    	try
        {
    		f = -1;
    		if(PIE) {
    			f = Float.valueOf(PIEVals.get(txtBox).getText().toString().trim()).floatValue();
    		} else {
    			f = Float.valueOf(VIRVals.get(txtBox).getText().toString().trim()).floatValue();
    		}
    		return f;
        }
        catch (NumberFormatException nfe)
        {
        	if(PIE) {
        		PIEVals.get(txtBox).setText("");
        	} else {
        		VIRVals.get(txtBox).setText("");
        	}
        	return -1;
        }
    }
}
