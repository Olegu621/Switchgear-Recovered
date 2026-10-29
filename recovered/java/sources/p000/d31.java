            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Build;
            import android.util.DisplayMetrics;
            import android.view.Display;
            import android.view.View;
            import android.view.WindowManager;
            import android.view.WindowMetrics;
            import java.util.Calendar;
            import java.util.HashMap;
            import java.util.Locale;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 365 */   public final class d31 {

                /* JADX INFO: renamed from: a */
                public final HashMap f6967a;

                public d31(Context context, ii2 ii2Var) {
                    DisplayMetrics displayMetrics;
                    te2 te2Var;
/* 1 */             context.getClass();
/* 9 */             HashMap map = new HashMap();
/* 12 */            this.f6967a = map;
/* 22 */            String id = Calendar.getInstance().getTimeZone().getID();
/* 28 */            if (id != null) {
/* 31 */                map.put("tz", id);
                    }
/* 38 */            String displayLanguage = Locale.getDefault().getDisplayLanguage();
/* 44 */            if (displayLanguage != null) {
/* 47 */                map.put("lang", displayLanguage);
                    }
/* 67 */            if (Intrinsics.m6216a(Boolean.valueOf(ii2Var.m4545i()), Boolean.TRUE)) {
/* 94 */                m2917b(new te2(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels));
                    } else {
                        try {
/* 102 */                   if (Build.VERSION.SDK_INT >= 30) {
/* 1 */                         WindowMetrics currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
/* 116 */                       currentWindowMetrics.getClass();
/* 137 */                       te2Var = new te2(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
                            } else {
/* 143 */                       Object systemService = context.getSystemService("window");
/* 155 */                       WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
/* 158 */                       Display defaultDisplay = windowManager != null ? windowManager.getDefaultDisplay() : null;
/* 162 */                       if (defaultDisplay != null) {
/* 166 */                           displayMetrics = new DisplayMetrics();
/* 169 */                           defaultDisplay.getRealMetrics(displayMetrics);
                                } else {
/* 177 */                           displayMetrics = Resources.getSystem().getDisplayMetrics();
                                }
/* 187 */                       te2Var = new te2(displayMetrics.widthPixels, displayMetrics.heightPixels);
                            }
/* 190 */                   m2917b(te2Var);
                        } catch (Throwable unused) {
/* 198 */                   k50.m5980q("d31", "Failed to set default screen resolution.", new Object[0]);
                        }
                    }
/* 201 */           String strM4546j = ii2Var.m4546j();
/* 205 */           if (strM4546j != null) {
/* 211 */               this.f6967a.put("uid", strM4546j);
                    }
/* 214 */           String strM4541e = ii2Var.m4541e();
/* 218 */           if (strM4541e != null) {
/* 224 */               this.f6967a.put("tnuid", strM4541e);
                    }
/* 227 */           String strM4538b = ii2Var.m4538b();
/* 231 */           if (strM4538b != null) {
/* 237 */               this.f6967a.put("duid", strM4538b);
                    }
/* 240 */           String strM4547k = ii2Var.m4547k();
/* 244 */           if (strM4547k != null) {
/* 250 */               this.f6967a.put("ua", strM4547k);
                    }
/* 253 */           String strM4539c = ii2Var.m4539c();
/* 257 */           if (strM4539c != null) {
/* 263 */               this.f6967a.put("ip", strM4539c);
                    }
/* 266 */           String strM4544h = ii2Var.m4544h();
/* 270 */           if (strM4544h != null) {
/* 274 */               this.f6967a.put("tz", strM4544h);
                    }
/* 277 */           String strM4540d = ii2Var.m4540d();
/* 281 */           if (strM4540d != null) {
/* 285 */               this.f6967a.put("lang", strM4540d);
                    }
/* 288 */           te2 te2VarM4542f = ii2Var.m4542f();
/* 292 */           if (te2VarM4542f != null) {
/* 294 */               m2917b(te2VarM4542f);
                    }
/* 297 */           te2 te2VarM4543g = ii2Var.m4543g();
/* 301 */           if (te2VarM4543g != null) {
/* 305 */               StringBuilder sb = new StringBuilder();
/* 310 */               sb.append(te2VarM4543g.f17059a);
/* 315 */               sb.append('x');
/* 320 */               sb.append(te2VarM4543g.f17060b);
/* 331 */               this.f6967a.put("vp", sb.toString());
                    }
/* 334 */           Integer numM4537a = ii2Var.m4537a();
/* 338 */           if (numM4537a != null) {
/* 356 */               this.f6967a.put("cd", Integer.valueOf(numM4537a.intValue()).toString());
                    }
/* 363 */           k50.m5958L("d31", "Subject created successfully.", new Object[0]);
                }

                /* JADX INFO: renamed from: a */
                public float m2916a(View view, String str) {
                    HashMap map;
                    float[] fArr;
/* 1 */             HashMap map2 = this.f6967a;
/* 7 */             if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
/* 38 */                return fArr[0];
                    }
/* 41 */            return Float.NaN;
                }

                /* JADX INFO: renamed from: b */
                public void m2917b(te2 te2Var) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(te2Var.f17059a);
/* 13 */            sb.append('x');
/* 18 */            sb.append(te2Var.f17060b);
/* 29 */            this.f6967a.put("res", sb.toString());
                }

/* 366 */       public d31() {
/* 368 */           this.f6967a = new HashMap();
                }
            }
