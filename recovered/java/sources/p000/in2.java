            package p000;

            import android.os.Build;
            import android.text.TextUtils;
            import android.view.View;
            import android.view.accessibility.AccessibilityNodeInfo;
            import android.widget.EditText;
            import androidx.appcompat.widget.AppCompatTextView;
            import com.google.android.material.textfield.TextInputLayout;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class in2 extends C2201t0 {

                /* JADX INFO: renamed from: d */
                public final TextInputLayout f9728d;

                public in2(TextInputLayout textInputLayout) {
/* 4 */             this.f9728d = textInputLayout;
                }

                @Override // p000.C2201t0
                /* JADX INFO: renamed from: d */
                public void mo128d(View view, C0901f1 c0901f1) {
/* 1 */             AccessibilityNodeInfo accessibilityNodeInfo = c0901f1.f7961a;
/* 5 */             this.f16886a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
/* 8 */             TextInputLayout textInputLayout = this.f9728d;
/* 10 */            EditText editText = textInputLayout.getEditText();
/* 21 */            CharSequence text = editText != null ? editText.getText() : null;
/* 22 */            CharSequence hint = textInputLayout.getHint();
/* 26 */            CharSequence error = textInputLayout.getError();
/* 30 */            CharSequence placeholderText = textInputLayout.getPlaceholderText();
/* 34 */            int counterMaxLength = textInputLayout.getCounterMaxLength();
/* 38 */            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
/* 42 */            boolean zIsEmpty = TextUtils.isEmpty(text);
/* 46 */            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
/* 50 */            boolean z = textInputLayout.f5064m1;
/* 52 */            boolean zIsEmpty3 = TextUtils.isEmpty(error);
/* 67 */            boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
/* 75 */            String string = !zIsEmpty2 ? hint.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
/* 77 */            kg2 kg2Var = textInputLayout.f5035b;
/* 79 */            AppCompatTextView appCompatTextView = kg2Var.f12748b;
/* 85 */            if (appCompatTextView.getVisibility() == 0) {
/* 87 */                accessibilityNodeInfo.setLabelFor(appCompatTextView);
/* 90 */                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
                    } else {
/* 96 */                accessibilityNodeInfo.setTraversalAfter(kg2Var.f12750d);
                    }
/* 101 */           if (!zIsEmpty) {
/* 103 */               c0901f1.m3632m(text);
                    } else if (!TextUtils.isEmpty(string)) {
/* 113 */               c0901f1.m3632m(string);
/* 116 */               if (!z && placeholderText != null) {
/* 138 */                   c0901f1.m3632m(string + ", " + ((Object) placeholderText));
                        }
                    } else if (placeholderText != null) {
/* 144 */               c0901f1.m3632m(placeholderText);
                    }
/* 151 */           if (!TextUtils.isEmpty(string)) {
/* 153 */               int i = Build.VERSION.SDK_INT;
/* 157 */               if (i >= 26) {
/* 159 */                   c0901f1.m3630k(string);
                        } else {
/* 163 */                   if (!zIsEmpty) {
/* 179 */                       string = ((Object) text) + ", " + string;
                            }
/* 183 */                   c0901f1.m3632m(string);
                        }
/* 186 */               if (i >= 26) {
/* 1 */                     accessibilityNodeInfo.setShowingHintText(zIsEmpty);
                        } else {
/* 193 */                   c0901f1.m3627h(4, zIsEmpty);
                        }
                    }
/* 196 */           if (text == null || text.length() != counterMaxLength) {
/* 205 */               counterMaxLength = -1;
                    }
/* 206 */           accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
/* 209 */           if (z2) {
/* 211 */               if (zIsEmpty3) {
/* 214 */                   error = counterOverflowDescription;
                        }
/* 215 */               accessibilityNodeInfo.setError(error);
                    }
/* 220 */           AppCompatTextView appCompatTextView2 = textInputLayout.f5025V.f15318r;
/* 222 */           if (appCompatTextView2 != null) {
/* 224 */               accessibilityNodeInfo.setLabelFor(appCompatTextView2);
                    }
                }
            }
