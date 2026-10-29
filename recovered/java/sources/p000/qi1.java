            package p000;

            import android.R;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.pm.PackageInfo;
            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.PorterDuff;
            import android.graphics.Shader;
            import android.graphics.SurfaceTexture;
            import android.graphics.drawable.BitmapDrawable;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import android.util.Base64;
            import android.util.Size;
            import android.view.Surface;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$color;
            import androidx.appcompat.R$drawable;
            import com.appsflyer.AppsFlyerProperties;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.installations.FirebaseInstallationsApi;
            import com.google.firebase.installations.InstallationTokenResult;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.security.MessageDigest;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 91 */    public final class qi1 {

                /* JADX INFO: renamed from: a */
                public Object f15572a;

                /* JADX INFO: renamed from: b */
                public Object f15573b;

                /* JADX INFO: renamed from: c */
                public Object f15574c;

                /* JADX INFO: renamed from: d */
                public Object f15575d;

                /* JADX INFO: renamed from: e */
                public Object f15576e;

                /* JADX INFO: renamed from: f */
                public Object f15577f;

                public qi1() {
/* 14 */            this.f15572a = new int[]{R$drawable.abc_textfield_search_default_mtrl_alpha, R$drawable.abc_textfield_default_mtrl_alpha, R$drawable.abc_ab_share_pack_mtrl_alpha};
/* 34 */            this.f15573b = new int[]{R$drawable.abc_ic_commit_search_api_mtrl_alpha, R$drawable.abc_seekbar_tick_mark_material, R$drawable.abc_ic_menu_share_mtrl_alpha, R$drawable.abc_ic_menu_copy_mtrl_am_alpha, R$drawable.abc_ic_menu_cut_mtrl_alpha, R$drawable.abc_ic_menu_selectall_mtrl_alpha, R$drawable.abc_ic_menu_paste_mtrl_am_alpha};
/* 54 */            this.f15574c = new int[]{R$drawable.abc_textfield_activated_mtrl_alpha, R$drawable.abc_textfield_search_activated_mtrl_alpha, R$drawable.abc_cab_background_top_mtrl_alpha, R$drawable.abc_text_cursor_material, R$drawable.abc_text_select_handle_left_mtrl, R$drawable.abc_text_select_handle_middle_mtrl, R$drawable.abc_text_select_handle_right_mtrl};
/* 66 */            this.f15575d = new int[]{R$drawable.abc_popup_background_mtrl_mult, R$drawable.abc_cab_background_internal_bg, R$drawable.abc_menu_hardkey_panel_mtrl_mult};
/* 76 */            this.f15576e = new int[]{R$drawable.abc_tab_indicator_material, R$drawable.abc_textfield_search_material};
/* 90 */            this.f15577f = new int[]{R$drawable.abc_btn_check_material, R$drawable.abc_btn_radio_material, R$drawable.abc_btn_check_material_anim, R$drawable.abc_btn_radio_material_anim};
                }

                /* JADX INFO: renamed from: a */
                public static boolean m7853a(int[] iArr, int i) {
/* 4 */             for (int i2 : iArr) {
/* 8 */                 if (i2 == i) {
/* 10 */                    return true;
                        }
                    }
/* 2 */             return false;
                }

                /* JADX INFO: renamed from: b */
                public static ColorStateList m7854b(Context context, int i) {
/* 3 */             int iM8585c = sn2.m8585c(context, R$attr.colorControlHighlight);
/* 9 */             int iM8584b = sn2.m8584b(context, R$attr.colorButtonNormal);
/* 13 */            int[] iArr = sn2.f16716b;
/* 15 */            int[] iArr2 = sn2.f16718d;
/* 17 */            int iM1452d = AbstractC0196bx.m1452d(iM8585c, i);
/* 39 */            return new ColorStateList(new int[][]{iArr, iArr2, sn2.f16717c, sn2.f16720f}, new int[]{iM8584b, iM1452d, AbstractC0196bx.m1452d(iM8585c, i), i});
                }

                /* JADX INFO: renamed from: f */
                public static LayerDrawable m7855f(x32 x32Var, Context context, int i) {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
/* 5 */             int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
/* 11 */            Drawable drawableM9698c = x32Var.m9698c(context, R$drawable.abc_star_black_48dp);
/* 17 */            Drawable drawableM9698c2 = x32Var.m9698c(context, R$drawable.abc_star_half_black_48dp);
/* 24 */            if ((drawableM9698c instanceof BitmapDrawable) && drawableM9698c.getIntrinsicWidth() == dimensionPixelSize && drawableM9698c.getIntrinsicHeight() == dimensionPixelSize) {
/* 38 */                bitmapDrawable = (BitmapDrawable) drawableM9698c;
/* 46 */                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                    } else {
/* 52 */                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
/* 58 */                Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 61 */                drawableM9698c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
/* 64 */                drawableM9698c.draw(canvas);
/* 69 */                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
/* 74 */                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                    }
/* 80 */            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
/* 85 */            if ((drawableM9698c2 instanceof BitmapDrawable) && drawableM9698c2.getIntrinsicWidth() == dimensionPixelSize && drawableM9698c2.getIntrinsicHeight() == dimensionPixelSize) {
/* 99 */                bitmapDrawable3 = (BitmapDrawable) drawableM9698c2;
                    } else {
/* 104 */               Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
/* 110 */               Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
/* 113 */               drawableM9698c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
/* 116 */               drawableM9698c2.draw(canvas2);
/* 121 */               bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                    }
/* 137 */           LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
/* 142 */           layerDrawable.setId(0, R.id.background);
/* 148 */           layerDrawable.setId(1, R.id.secondaryProgress);
/* 154 */           layerDrawable.setId(2, R.id.progress);
/* 157 */           return layerDrawable;
                }

                /* JADX INFO: renamed from: k */
                public static void m7856k(Drawable drawable, int i, PorterDuff.Mode mode) {
/* 1 */             Drawable drawableMutate = drawable.mutate();
/* 5 */             if (mode == null) {
/* 7 */                 mode = C2491ya.f19551b;
                    }
/* 13 */            drawableMutate.setColorFilter(C2491ya.m10133c(i, mode));
                }

                /* JADX INFO: renamed from: c */
                public fb2 m7857c() {
/* 4 */             SurfaceTexture surfaceTexture = new SurfaceTexture(0);
/* 9 */             Size size = (Size) this.f15575d;
/* 19 */            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
/* 24 */            Surface surface = new Surface(surfaceTexture);
/* 31 */            bb2 bb2VarM1315d = bb2.m1315d((pi1) this.f15574c, size);
/* 38 */            bb2VarM1315d.f164b.f11908a = 1;
/* 42 */            uw0 uw0Var = new uw0(surface);
/* 45 */            this.f15572a = uw0Var;
/* 49 */            s81 s81VarM9453w = w11.m9453w(uw0Var.f7030e);
/* 57 */            wc0 wc0Var = new wc0(19, surface, surfaceTexture);
/* 69 */            s81VarM9453w.mo3676a(new dp0(0, s81VarM9453w, wc0Var), pg3.m7428g());
/* 79 */            bb2VarM1315d.m1317b((uw0) this.f15572a, mb0.f13671d, -1);
/* 84 */            cb2 cb2Var = (cb2) this.f15577f;
/* 86 */            if (cb2Var != null) {
/* 88 */                cb2Var.m1609b();
                    }
/* 99 */            cb2 cb2Var2 = new cb2(new kv0(this, 2));
/* 102 */           this.f15577f = cb2Var2;
/* 104 */           bb2VarM1315d.f168f = cb2Var2;
/* 106 */           return bb2VarM1315d.m1318c();
                }

                /* JADX INFO: renamed from: d */
                public Task m7858d(Task task) {
/* 11 */            return task.continueWith(new qd1(), new s80(this));
                }

                /* JADX INFO: renamed from: e */
                public ArrayList m7859e() {
                    ArrayList arrayList;
                    synchronized (this.f15573b) {
/* 10 */                arrayList = new ArrayList((LinkedHashSet) this.f15574c);
                    }
/* 14 */            return arrayList;
                }

                /* JADX INFO: renamed from: g */
                public ArrayList m7860g() {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    synchronized (this.f15573b) {
/* 6 */                 arrayList = new ArrayList();
/* 13 */                arrayList.addAll(m7859e());
                        synchronized (this.f15573b) {
/* 25 */                    arrayList2 = new ArrayList((LinkedHashSet) this.f15576e);
                        }
/* 29 */                arrayList.addAll(arrayList2);
                    }
/* 33 */            return arrayList;
                }

                /* JADX INFO: renamed from: h */
                public ColorStateList m7861h(Context context, int i) {
/* 3 */             if (i == R$drawable.abc_edit_text_material) {
/* 7 */                 return v00.getColorStateList(context, R$color.abc_tint_edittext);
                    }
/* 14 */            if (i == R$drawable.abc_switch_track_mtrl_alpha) {
/* 18 */                return v00.getColorStateList(context, R$color.abc_tint_switch_track);
                    }
/* 26 */            if (i != R$drawable.abc_switch_thumb_material) {
/* 126 */               if (i == R$drawable.abc_btn_default_mtrl_shape) {
/* 134 */                   return m7854b(context, sn2.m8585c(context, R$attr.colorButtonNormal));
                        }
/* 141 */               if (i == R$drawable.abc_btn_borderless_material) {
/* 143 */                   return m7854b(context, 0);
                        }
/* 150 */               if (i == R$drawable.abc_btn_colored_material) {
/* 158 */                   return m7854b(context, sn2.m8585c(context, R$attr.colorAccent));
                        }
/* 165 */               if (i == R$drawable.abc_spinner_mtrl_am_alpha || i == R$drawable.abc_spinner_textfield_background_material) {
/* 238 */                   return v00.getColorStateList(context, R$color.abc_tint_spinner);
                        }
/* 180 */               if (m7853a((int[]) this.f15573b, i)) {
/* 184 */                   return sn2.m8586d(context, R$attr.colorControlNormal);
                        }
/* 197 */               if (m7853a((int[]) this.f15576e, i)) {
/* 201 */                   return v00.getColorStateList(context, R$color.abc_tint_default);
                        }
/* 214 */               if (m7853a((int[]) this.f15577f, i)) {
/* 218 */                   return v00.getColorStateList(context, R$color.abc_tint_btn_checkable);
                        }
/* 225 */               if (i == R$drawable.abc_seekbar_thumb_material) {
/* 229 */                   return v00.getColorStateList(context, R$color.abc_tint_seek_thumb);
                        }
/* 234 */               return null;
                    }
/* 29 */            int[][] iArr = new int[3][];
/* 31 */            int[] iArr2 = new int[3];
/* 35 */            ColorStateList colorStateListM8586d = sn2.m8586d(context, R$attr.colorSwitchThumbNormal);
/* 41 */            if (colorStateListM8586d == null || !colorStateListM8586d.isStateful()) {
/* 84 */                iArr[0] = sn2.f16716b;
/* 92 */                iArr2[0] = sn2.m8584b(context, R$attr.colorSwitchThumbNormal);
/* 96 */                iArr[1] = sn2.f16719e;
/* 104 */               iArr2[1] = sn2.m8585c(context, R$attr.colorControlActivated);
/* 108 */               iArr[2] = sn2.f16720f;
/* 116 */               iArr2[2] = sn2.m8585c(context, R$attr.colorSwitchThumbNormal);
                    } else {
/* 49 */                int[] iArr3 = sn2.f16716b;
/* 51 */                iArr[0] = iArr3;
/* 57 */                iArr2[0] = colorStateListM8586d.getColorForState(iArr3, 0);
/* 61 */                iArr[1] = sn2.f16719e;
/* 69 */                iArr2[1] = sn2.m8585c(context, R$attr.colorControlActivated);
/* 73 */                iArr[2] = sn2.f16720f;
/* 79 */                iArr2[2] = colorStateListM8586d.getDefaultColor();
                    }
/* 120 */           return new ColorStateList(iArr, iArr2);
                }

                /* JADX INFO: renamed from: i */
                public void m7862i(String str, HashMap map, boolean z, er0 er0Var) {
/* 3 */             ts0 ts0Var = (ts0) this.f15575d;
/* 7 */             C0210cb c0210cb = (C0210cb) this.f15577f;
/* 16 */            if (!c0210cb.m1567A() || b40.m1232p(str) || b40.m1233q(map)) {
/* 174 */               xe2.m9777o("pshTknManagr", "Error in syncing push token, preconditions failed.", null);
/* 177 */               return;
                    }
/* 46 */            HashMap mapM1239w = b40.m1239w(((er0) ((er0) ts0Var.f17248a).f7853b).m3589r("network_headers"));
/* 60 */            String strM3589r = ((er0) ((er0) ts0Var.f17248a).f7853b).m3589r("push_token_sync_route");
/* 68 */            String strM3588q = ((er0) this.f15572a).m3588q();
/* 72 */            String strM1599v = c0210cb.m1599v();
/* 80 */            if (b40.m1233q(mapM1239w) || b40.m1232p(strM3589r) || b40.m1232p(strM3588q) || b40.m1232p(strM1599v)) {
/* 168 */               xe2.m9777o("pshTknManagr", "Error in reading network header and route data", null);
/* 171 */               return;
                    }
                    try {
/* 103 */               map.put("token", str);
/* 108 */               map.put("did", strM1599v);
/* 113 */               map.put("platform-id", strM3588q);
/* 120 */               wc0 wc0Var = new wc0(13, mapM1239w, map);
/* 155 */               ((fs0) ((ra2) this.f15573b).f15955a).m3826w(new ft0(this, new d52(new lp0((ec0) this.f15574c, strM3589r, 1)), wc0Var, z, er0Var));
                    } catch (Exception e) {
/* 162 */               xe2.m9777o("pshTknManagr", "Error in syncing push token", e);
                    }
                }

                /* JADX INFO: renamed from: j */
                public void m7863j(String str, String str2, Bundle bundle) {
                    int i;
                    String str3;
                    String strEncodeToString;
                    boolean zM8891E;
                    int i2;
                    PackageInfo packageInfoM8663c;
/* 3 */             bundle.putString("scope", str2);
/* 8 */             bundle.putString("sender", str);
/* 13 */            bundle.putString("subtype", str);
/* 20 */            vi0 vi0Var = (vi0) this.f15572a;
/* 22 */            vi0Var.m9274a();
/* 29 */            bundle.putString("gmp_app_id", vi0Var.f18194c.f2935b);
/* 36 */            C2199sz c2199sz = (C2199sz) this.f15573b;
                    synchronized (c2199sz) {
                        try {
/* 41 */                    if (c2199sz.f16873a == 0 && (packageInfoM8663c = c2199sz.m8663c("com.google.android.gms")) != null) {
/* 53 */                        c2199sz.f16873a = packageInfoM8663c.versionCode;
                            }
/* 59 */                    i = c2199sz.f16873a;
                        } catch (Throwable th) {
/* 356 */                   throw th;
                        }
                    }
/* 66 */            bundle.putString("gmsv", Integer.toString(i));
/* 77 */            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
/* 90 */            bundle.putString("app_ver", ((C2199sz) this.f15573b).m8662a());
/* 98 */            C2199sz c2199sz2 = (C2199sz) this.f15573b;
                    synchronized (c2199sz2) {
                        try {
/* 105 */                   if (((String) c2199sz2.f16877e) == null) {
/* 107 */                       c2199sz2.m8666f();
                            }
/* 116 */                   str3 = (String) c2199sz2.f16877e;
                        } catch (Throwable th2) {
/* 354 */                   throw th2;
                        }
                    }
/* 119 */           bundle.putString("app_ver_name", str3);
/* 126 */           vi0 vi0Var2 = (vi0) this.f15572a;
/* 128 */           vi0Var2.m9274a();
                    try {
/* 149 */               strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(vi0Var2.f18193b.getBytes()), 11);
                    } catch (NoSuchAlgorithmException unused) {
/* 154 */               strEncodeToString = "[HASH-ERROR]";
                    }
/* 156 */           bundle.putString("firebase-app-name-hash", strEncodeToString);
                    try {
/* 174 */               String token = ((InstallationTokenResult) Tasks.await(((FirebaseInstallationsApi) this.f15577f).getToken(false))).getToken();
/* 182 */               if (TextUtils.isEmpty(token)) {
/* 198 */                   AbstractC1245n0.m4889q("FirebaseMessaging", "FIS auth token is empty");
                        } else {
/* 186 */                   bundle.putString("Goog-Firebase-Installations-Auth", token);
                        }
                    } catch (InterruptedException e) {
/* 190 */               e = e;
/* 206 */               AbstractC1245n0.m4877e("FirebaseMessaging", "Failed to get FIS auth token", e);
                    } catch (ExecutionException e2) {
/* 192 */               e = e2;
/* 206 */               AbstractC1245n0.m4877e("FirebaseMessaging", "Failed to get FIS auth token", e);
                    }
/* 225 */           bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(((FirebaseInstallationsApi) this.f15577f).getId()));
/* 232 */           bundle.putString("cliv", "fcm-24.1.2");
/* 243 */           zt0 zt0Var = (zt0) ((iz1) this.f15576e).get();
/* 253 */           a70 a70Var = (a70) ((iz1) this.f15575d).get();
/* 255 */           if (zt0Var == null || a70Var == null) {
/* 352 */               return;
                    }
/* 259 */           b60 b60Var = (b60) zt0Var;
                    synchronized (b60Var) {
/* 262 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 272 */               ts0 ts0Var = (ts0) b60Var.f2233a.get();
                        synchronized (ts0Var) {
/* 275 */                   zM8891E = ts0Var.m8891E(jCurrentTimeMillis);
                        }
/* 281 */               if (zM8891E) {
                            synchronized (ts0Var) {
/* 288 */                       String strM8901k = ts0Var.m8901k(System.currentTimeMillis());
/* 306 */                       ((SharedPreferences) ts0Var.f17248a).edit().putString("last-used-date", strM8901k).commit();
/* 309 */                       ts0Var.m8889C(strM8901k);
                            }
/* 314 */                   i2 = 3;
                        } else {
/* 320 */                   i2 = 1;
                        }
                    }
/* 321 */           if (i2 != 1) {
/* 333 */               bundle.putString("Firebase-Client-Log-Type", Integer.toString(AbstractC0886en.m3520y(i2)));
/* 342 */               bundle.putString("Firebase-Client", a70Var.m93a());
                    }
                }

                /* JADX INFO: renamed from: l */
                public Task m7864l(String str, String str2, Bundle bundle) {
                    int i;
                    try {
/* 1 */                 m7863j(str, str2, bundle);
/* 6 */                 h52 h52Var = (h52) this.f15574c;
/* 8 */                 o80 o80Var = o80.f14671d;
/* 10 */                cd1 cd1Var = h52Var.f8907c;
/* 19 */                if (cd1Var.m1632b() < 12000000) {
                            return cd1Var.m1633c() != 0 ? h52Var.m4116a(bundle).continueWithTask(o80Var, new we2(h52Var, bundle, 27, false)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
                        }
/* 58 */                ur3 ur3VarM9133c = ur3.m9133c(h52Var.f8906b);
                        synchronized (ur3VarM9133c) {
/* 65 */                    i = ur3VarM9133c.f17703a;
/* 69 */                    ur3VarM9133c.f17703a = i + 1;
                        }
/* 82 */                return ur3VarM9133c.m9134d(new vq3(i, 1, bundle, 1)).continueWith(o80Var, xt0.f19359X);
                    } catch (InterruptedException | ExecutionException e) {
/* 91 */                return Tasks.forException(e);
                    }
                }

/* 92 */        public qi1(String str, String str2, List list, ej0 ej0Var, String str3, cv1 cv1Var) {
                    str.getClass();
                    str2.getClass();
                    list.getClass();
                    ej0Var.getClass();
/* 94 */            this.f15572a = str;
/* 95 */            this.f15573b = str2;
/* 96 */            this.f15574c = list;
/* 97 */            this.f15575d = ej0Var;
/* 98 */            this.f15576e = str3;
/* 99 */            this.f15577f = cv1Var;
                }
            }
