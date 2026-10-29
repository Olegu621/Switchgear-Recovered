            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.graphics.PorterDuffColorFilter;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.LayerDrawable;
            import android.util.TypedValue;
            import androidx.appcompat.R$attr;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.R$drawable;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x32 {

                /* JADX INFO: renamed from: g */
                public static x32 f18928g;

                /* JADX INFO: renamed from: a */
                public WeakHashMap f18930a;

                /* JADX INFO: renamed from: b */
                public final WeakHashMap f18931b = new WeakHashMap(0);

                /* JADX INFO: renamed from: c */
                public TypedValue f18932c;

                /* JADX INFO: renamed from: d */
                public boolean f18933d;

                /* JADX INFO: renamed from: e */
                public qi1 f18934e;

                /* JADX INFO: renamed from: f */
                public static final PorterDuff.Mode f18927f = PorterDuff.Mode.SRC_IN;

                /* JADX INFO: renamed from: h */
                public static final w32 f18929h = new w32(6);

                /* JADX INFO: renamed from: b */
                public static synchronized x32 m9695b() {
                    try {
/* 6 */                 if (f18928g == null) {
/* 13 */                    f18928g = new x32();
                        }
                    } catch (Throwable th) {
/* 23 */                throw th;
                    }
/* 18 */            return f18928g;
                }

                /* JADX INFO: renamed from: e */
                public static synchronized PorterDuffColorFilter m9696e(int i, PorterDuff.Mode mode) {
                    PorterDuffColorFilter porterDuffColorFilter;
/* 4 */             w32 w32Var = f18929h;
/* 6 */             w32Var.getClass();
/* 13 */            int i2 = (31 + i) * 31;
/* 27 */            porterDuffColorFilter = (PorterDuffColorFilter) w32Var.get(Integer.valueOf(mode.hashCode() + i2));
/* 29 */            if (porterDuffColorFilter == null) {
/* 33 */                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                    }
/* 55 */            return porterDuffColorFilter;
                }

                /* JADX INFO: renamed from: a */
                public final Drawable m9697a(Context context, int i) {
                    LayerDrawable layerDrawableM7855f;
                    WeakReference weakReference;
                    Drawable drawableNewDrawable;
/* 3 */             if (this.f18932c == null) {
/* 10 */                this.f18932c = new TypedValue();
                    }
/* 12 */            TypedValue typedValue = this.f18932c;
/* 19 */            context.getResources().getValue(i, typedValue, true);
/* 31 */            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
                    synchronized (this) {
/* 39 */                ta1 ta1Var = (ta1) this.f18931b.get(context);
/* 41 */                layerDrawableM7855f = null;
/* 42 */                if (ta1Var != null && (weakReference = (WeakReference) ta1Var.m8754c(j)) != null) {
/* 59 */                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
/* 61 */                    if (constantState != null) {
/* 67 */                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                            } else {
/* 80 */                        int iM7587J = py0.m7587J(ta1Var.f17006b, ta1Var.f17008d, j);
/* 84 */                        if (iM7587J >= 0) {
/* 86 */                            Object[] objArr = ta1Var.f17007c;
/* 88 */                            Object obj = objArr[iM7587J];
/* 90 */                            Object obj2 = ta1.f17004e;
/* 92 */                            if (obj != obj2) {
/* 94 */                                objArr[iM7587J] = obj2;
/* 96 */                                ta1Var.f17005a = true;
                                    }
                                }
                            }
                        }
/* 45 */                drawableNewDrawable = null;
                    }
/* 100 */           if (drawableNewDrawable != null) {
/* 102 */               return drawableNewDrawable;
                    }
/* 105 */           if (this.f18934e != null) {
/* 110 */               if (i == R$drawable.abc_cab_background_top_material) {
/* 130 */                   layerDrawableM7855f = new LayerDrawable(new Drawable[]{m9698c(context, R$drawable.abc_cab_background_internal_bg), m9698c(context, R$drawable.abc_cab_background_top_mtrl_alpha)});
                        } else if (i == R$drawable.abc_ratingbar_material) {
/* 140 */                   layerDrawableM7855f = qi1.m7855f(this, context, R$dimen.abc_star_big);
                        } else if (i == R$drawable.abc_ratingbar_indicator_material) {
/* 151 */                   layerDrawableM7855f = qi1.m7855f(this, context, R$dimen.abc_star_medium);
                        } else if (i == R$drawable.abc_ratingbar_small_material) {
/* 162 */                   layerDrawableM7855f = qi1.m7855f(this, context, R$dimen.abc_star_small);
                        }
                    }
/* 166 */           if (layerDrawableM7855f == null) {
/* 217 */               return layerDrawableM7855f;
                    }
/* 170 */           layerDrawableM7855f.setChangingConfigurations(typedValue.changingConfigurations);
                    synchronized (this) {
                        try {
/* 174 */                   Drawable.ConstantState constantState2 = layerDrawableM7855f.getConstantState();
/* 178 */                   if (constantState2 == null) {
/* 214 */                       return layerDrawableM7855f;
                            }
/* 186 */                   ta1 ta1Var2 = (ta1) this.f18931b.get(context);
/* 188 */                   if (ta1Var2 == null) {
/* 192 */                       ta1Var2 = new ta1();
/* 197 */                       this.f18931b.put(context, ta1Var2);
                            }
/* 208 */                   ta1Var2.m8755d(new WeakReference(constantState2), j);
/* 212 */                   return layerDrawableM7855f;
                        } catch (Throwable th) {
/* 216 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final synchronized Drawable m9698c(Context context, int i) {
/* 3 */             return m9699d(context, i, false);
                }

                /* JADX INFO: renamed from: d */
                public final synchronized Drawable m9699d(Context context, int i, boolean z) {
                    Drawable drawableM9697a;
                    try {
/* 4 */                 if (!this.f18933d) {
/* 8 */                     this.f18933d = true;
/* 12 */                    Drawable drawableM9698c = m9698c(context, androidx.appcompat.resources.R$drawable.abc_vector_test);
/* 16 */                    if (drawableM9698c == null || !"android.graphics.drawable.VectorDrawable".equals(drawableM9698c.getClass().getName())) {
/* 61 */                        this.f18933d = false;
/* 70 */                        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                            }
                        }
/* 34 */                drawableM9697a = m9697a(context, i);
/* 38 */                if (drawableM9697a == null) {
/* 40 */                    drawableM9697a = v00.getDrawable(context, i);
                        }
/* 47 */                if (drawableM9697a != null) {
/* 49 */                    drawableM9697a = m9701g(context, i, z, drawableM9697a);
                        }
/* 53 */                if (drawableM9697a != null) {
/* 55 */                    w90.m9483a(drawableM9697a);
                        }
                    } catch (Throwable th) {
/* 72 */                throw th;
                    }
/* 59 */            return drawableM9697a;
                }

                /* JADX INFO: renamed from: f */
                public final synchronized ColorStateList m9700f(Context context, int i) {
                    ColorStateList colorStateList;
                    vf2 vf2Var;
/* 2 */             WeakHashMap weakHashMap = this.f18930a;
/* 4 */             ColorStateList colorStateListM7861h = null;
/* 22 */            colorStateList = (weakHashMap == null || (vf2Var = (vf2) weakHashMap.get(context)) == null) ? null : (ColorStateList) vf2Var.m9265b(i);
/* 23 */            if (colorStateList == null) {
/* 25 */                qi1 qi1Var = this.f18934e;
/* 27 */                if (qi1Var != null) {
/* 30 */                    colorStateListM7861h = qi1Var.m7861h(context, i);
                        }
/* 34 */                if (colorStateListM7861h != null) {
/* 38 */                    if (this.f18930a == null) {
/* 45 */                        this.f18930a = new WeakHashMap();
                            }
/* 53 */                    vf2 vf2Var2 = (vf2) this.f18930a.get(context);
/* 55 */                    if (vf2Var2 == null) {
/* 59 */                        vf2Var2 = new vf2();
/* 64 */                        this.f18930a.put(context, vf2Var2);
                            }
/* 67 */                    vf2Var2.m9264a(i, colorStateListM7861h);
                        }
/* 70 */                colorStateList = colorStateListM7861h;
                    }
/* 75 */            return colorStateList;
                }

                /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:51:0x00f9  */
                /* JADX INFO: renamed from: g */
                public final Drawable m9701g(Context context, int i, boolean z, Drawable drawable) {
                    int i2;
                    boolean z2;
                    int iRound;
                    Drawable drawableMutate;
/* 1 */             ColorStateList colorStateListM9700f = m9700f(context, i);
/* 5 */             PorterDuff.Mode mode = null;
/* 6 */             if (colorStateListM9700f != null) {
/* 8 */                 Drawable drawableMutate2 = drawable.mutate();
/* 12 */                s90.m8448h(drawableMutate2, colorStateListM9700f);
/* 17 */                if (this.f18934e != null && i == R$drawable.abc_switch_thumb_material) {
/* 24 */                    mode = PorterDuff.Mode.MULTIPLY;
                        }
/* 26 */                if (mode != null) {
/* 28 */                    s90.m8449i(drawableMutate2, mode);
                        }
/* 31 */                return drawableMutate2;
                    }
/* 34 */            if (this.f18934e != null) {
/* 46 */                if (i == R$drawable.abc_seekbar_track_material) {
/* 49 */                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
/* 51 */                    Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
/* 57 */                    int iM8585c = sn2.m8585c(context, R$attr.colorControlNormal);
/* 61 */                    PorterDuff.Mode mode2 = C2491ya.f19551b;
/* 63 */                    qi1.m7856k(drawableFindDrawableByLayerId, iM8585c, mode2);
/* 76 */                    qi1.m7856k(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), sn2.m8585c(context, R$attr.colorControlNormal), mode2);
/* 89 */                    qi1.m7856k(layerDrawable.findDrawableByLayerId(R.id.progress), sn2.m8585c(context, R$attr.colorControlActivated), mode2);
/* 92 */                    return drawable;
                        }
/* 95 */                if (i == R$drawable.abc_ratingbar_material || i == R$drawable.abc_ratingbar_indicator_material || i == R$drawable.abc_ratingbar_small_material) {
/* 106 */                   LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
/* 108 */                   Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.background);
/* 114 */                   int iM8584b = sn2.m8584b(context, R$attr.colorControlNormal);
/* 118 */                   PorterDuff.Mode mode3 = C2491ya.f19551b;
/* 120 */                   qi1.m7856k(drawableFindDrawableByLayerId2, iM8584b, mode3);
/* 133 */                   qi1.m7856k(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), sn2.m8585c(context, R$attr.colorControlActivated), mode3);
/* 146 */                   qi1.m7856k(layerDrawable2.findDrawableByLayerId(R.id.progress), sn2.m8585c(context, R$attr.colorControlActivated), mode3);
/* 149 */                   return drawable;
                        }
                    }
/* 150 */           qi1 qi1Var = this.f18934e;
/* 152 */           boolean z3 = false;
/* 153 */           if (qi1Var != null) {
/* 155 */               PorterDuff.Mode mode4 = C2491ya.f19551b;
/* 167 */               if (qi1.m7853a((int[]) qi1Var.f15572a, i)) {
/* 169 */                   i2 = R$attr.colorControlNormal;
                        } else if (qi1.m7853a((int[]) qi1Var.f15574c, i)) {
/* 184 */                   i2 = R$attr.colorControlActivated;
                        } else {
/* 198 */                   if (qi1.m7853a((int[]) qi1Var.f15575d, i)) {
/* 200 */                       mode4 = PorterDuff.Mode.MULTIPLY;
                            } else {
/* 206 */                       if (i == R$drawable.abc_list_divider_mtrl_alpha) {
/* 211 */                           iRound = Math.round(40.8f);
/* 220 */                           i2 = 16842800;
/* 221 */                           z2 = true;
                                } else {
/* 225 */                           if (i != R$drawable.abc_dialog_material_background) {
/* 228 */                               i2 = 0;
/* 229 */                               z2 = false;
                                    }
/* 172 */                           iRound = -1;
                                }
/* 231 */                       if (z2) {
/* 233 */                           drawableMutate = drawable.mutate();
/* 245 */                           drawableMutate.setColorFilter(C2491ya.m10133c(sn2.m8585c(context, i2), mode4));
/* 248 */                           if (iRound != -1) {
/* 250 */                               drawableMutate.setAlpha(iRound);
                                    }
/* 253 */                           z3 = true;
                                }
                            }
/* 202 */                   i2 = 16842801;
                        }
/* 171 */               z2 = true;
/* 172 */               iRound = -1;
/* 231 */               if (z2) {
/* 233 */                   drawableMutate = drawable.mutate();
/* 245 */                   drawableMutate.setColorFilter(C2491ya.m10133c(sn2.m8585c(context, i2), mode4));
/* 248 */                   if (iRound != -1) {
/* 250 */                       drawableMutate.setAlpha(iRound);
                            }
/* 253 */                   z3 = true;
                        }
                    }
/* 254 */           if (z3 || !z) {
/* 259 */               return drawable;
                    }
/* 5 */             return null;
                }
            }
