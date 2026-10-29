            package p000;

            import android.text.Editable;
            import android.text.Selection;
            import android.text.TextUtils;
            import android.view.MenuItem;
            import androidx.preference.EditTextPreference;
            import androidx.preference.Preference;
            import androidx.preference.R$string;
            import com.google.android.material.navigation.AbstractC0368d;
            import java.io.BufferedReader;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.security.KeyFactory;
            import java.security.Provider;
            import java.security.Signature;
            import java.util.concurrent.Executors;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 37 */    public final class ec0 implements ew1, ie0, sg0, v32, hg1, fz2, ay1 {

                /* JADX INFO: renamed from: b */
                public static ec0 f7616b;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7617a;

                public ec0(JSONObject jSONObject) {
/* 3 */             this.f7617a = 25;
/* 10 */            jSONObject.optString("billingPeriod");
/* 15 */            jSONObject.optString("priceCurrencyCode");
/* 20 */            jSONObject.optString("formattedPrice");
/* 25 */            jSONObject.optLong("priceAmountMicros");
/* 30 */            jSONObject.optInt("recurrenceMode");
/* 35 */            jSONObject.optInt("billingCycleCount");
                }

                /* JADX INFO: renamed from: g */
                public static boolean m3400g(zc0 zc0Var, Editable editable, int i, int i2, boolean z) {
                    int iMin;
/* 2 */             if (editable != null && i >= 0 && i2 >= 0) {
/* 10 */                int selectionStart = Selection.getSelectionStart(editable);
/* 14 */                int selectionEnd = Selection.getSelectionEnd(editable);
/* 19 */                if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
/* 28 */                    if (z) {
/* 30 */                        int iMax = Math.max(i, 0);
/* 34 */                        int length = editable.length();
/* 38 */                        if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                                    loop0: while (true) {
/* 47 */                                boolean z2 = false;
                                        while (true) {
/* 48 */                                    if (iMax == 0) {
                                                break loop0;
                                            }
/* 51 */                                    selectionStart--;
/* 53 */                                    if (selectionStart < 0) {
/* 55 */                                        if (!z2) {
/* 58 */                                            selectionStart = 0;
                                                    break loop0;
                                                }
                                                break loop0;
                                            }
/* 60 */                                    char cCharAt = editable.charAt(selectionStart);
/* 64 */                                    if (z2) {
/* 70 */                                        if (Character.isHighSurrogate(cCharAt)) {
/* 73 */                                            iMax--;
                                                }
                                            } else if (!Character.isSurrogate(cCharAt)) {
/* 82 */                                        iMax--;
                                            } else if (!Character.isHighSurrogate(cCharAt)) {
/* 92 */                                        z2 = true;
                                            }
/* 45 */                                    selectionStart = -1;
                                            break loop0;
                                        }
                                    }
                                }
/* 45 */                        selectionStart = -1;
                                break loop0;
/* 94 */                        int iMax2 = Math.max(i2, 0);
/* 98 */                        iMin = editable.length();
/* 102 */                       if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                                    loop2: while (true) {
/* 111 */                               boolean z3 = false;
                                        while (true) {
/* 112 */                                   if (iMax2 != 0) {
/* 116 */                                       if (selectionEnd >= iMin) {
/* 118 */                                           if (!z3) {
                                                        break loop2;
                                                    }
                                                    break loop2;
                                                }
/* 121 */                                       char cCharAt2 = editable.charAt(selectionEnd);
/* 125 */                                       if (z3) {
/* 131 */                                           if (Character.isLowSurrogate(cCharAt2)) {
/* 134 */                                               iMax2--;
/* 136 */                                               selectionEnd++;
                                                    }
                                                } else if (!Character.isSurrogate(cCharAt2)) {
/* 145 */                                           iMax2--;
/* 147 */                                           selectionEnd++;
                                                } else if (!Character.isLowSurrogate(cCharAt2)) {
/* 157 */                                           selectionEnd++;
/* 159 */                                           z3 = true;
                                                }
/* 109 */                                       iMin = -1;
                                                break loop2;
                                            }
/* 114 */                                   iMin = selectionEnd;
                                            break loop2;
                                        }
                                    }
                                }
/* 109 */                       iMin = -1;
                                break loop2;
/* 161 */                       if (selectionStart != -1 && iMin != -1) {
                                }
                            } else {
/* 167 */                       selectionStart = Math.max(selectionStart - i, 0);
/* 176 */                       iMin = Math.min(selectionEnd + i2, editable.length());
                            }
/* 186 */                   rs2[] rs2VarArr = (rs2[]) editable.getSpans(selectionStart, iMin, rs2.class);
/* 188 */                   if (rs2VarArr != null && rs2VarArr.length > 0) {
/* 195 */                       for (rs2 rs2Var : rs2VarArr) {
/* 199 */                           int spanStart = editable.getSpanStart(rs2Var);
/* 203 */                           int spanEnd = editable.getSpanEnd(rs2Var);
/* 207 */                           selectionStart = Math.min(spanStart, selectionStart);
/* 211 */                           iMin = Math.max(spanEnd, iMin);
                                }
/* 218 */                       int iMax3 = Math.max(selectionStart, 0);
/* 226 */                       int iMin2 = Math.min(iMin, editable.length());
/* 230 */                       zc0Var.beginBatchEdit();
/* 233 */                       editable.delete(iMax3, iMin2);
/* 236 */                       zc0Var.endBatchEdit();
/* 27 */                        return true;
                            }
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: h */
                public static String m3401h(InputStream inputStream) throws Throwable {
                    InputStreamReader inputStreamReader;
                    Throwable th;
                    BufferedReader bufferedReader;
/* 2 */             if (inputStream == null) {
/* 1 */                 return null;
                    }
/* 7 */             StringBuilder sb = new StringBuilder();
                    try {
/* 12 */                inputStreamReader = new InputStreamReader(inputStream);
                        try {
/* 17 */                    bufferedReader = new BufferedReader(inputStreamReader);
                            while (true) {
                                try {
/* 20 */                            String line = bufferedReader.readLine();
/* 24 */                            if (line == null) {
/* 32 */                                b40.m1221e(bufferedReader);
/* 35 */                                b40.m1221e(inputStreamReader);
/* 38 */                                return sb.toString();
                                    }
/* 26 */                            sb.append(line);
                                } catch (Throwable th2) {
/* 30 */                            th = th2;
/* 52 */                            b40.m1221e(bufferedReader);
/* 55 */                            b40.m1221e(inputStreamReader);
/* 58 */                            throw th;
                                }
                            }
                        } catch (Throwable th3) {
/* 45 */                    th = th3;
/* 46 */                    bufferedReader = null;
                        }
                    } catch (Throwable th4) {
/* 49 */                inputStreamReader = null;
/* 50 */                th = th4;
/* 51 */                bufferedReader = null;
                    }
                }

                @Override // p000.ie0
                /* JADX INFO: renamed from: a */
                public Object mo3402a(String str, Provider provider) {
                    switch (this.f7617a) {
                        case 2:
                            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
                        case 3:
                            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
                        case 4:
                            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
                        default:
                            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
                    }
                }

                @Override // p000.fz2
                /* JADX INFO: renamed from: b */
                public void mo3403b(ez2 ez2Var) {
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: c */
                public boolean mo3404c(jg1 jg1Var, MenuItem menuItem) {
/* 1 */             return false;
                }

                @Override // p000.v32
                /* JADX INFO: renamed from: d */
                public boolean mo3405d(String str, String str2) {
/* 1 */             return false;
                }

                @Override // p000.ew1
                /* JADX INFO: renamed from: e */
                public CharSequence mo3406e(Preference preference) {
/* 1 */             EditTextPreference editTextPreference = (EditTextPreference) preference;
/* 8 */             if (TextUtils.isEmpty(null)) {
/* 14 */                return editTextPreference.f1560a.getString(R$string.not_set);
                    }
/* 3 */             return null;
                }

                @Override // p000.ay1
                /* JADX INFO: renamed from: f */
                public void mo1180f(int i, Object obj) {
                }

                @Override // javax.inject.Provider
                public Object get() {
/* 8 */             return new ku0(Executors.newSingleThreadExecutor(), 2);
                }

                @Override // p000.hg1
                /* JADX INFO: renamed from: l */
                public void mo3407l(jg1 jg1Var) {
                }

/* 38 */        public /* synthetic */ ec0(int i) {
/* 39 */            this.f7617a = i;
                }

/* 39 */        public ec0(String str, String str2, String str3, String str4) {
                    this.f7617a = 8;
                    str.getClass();
                    str2.getClass();
                    str3.getClass();
                    str4.getClass();
                }

/* 40 */        public ec0(AbstractC0368d abstractC0368d) {
                    this.f7617a = 21;
                }
            }
