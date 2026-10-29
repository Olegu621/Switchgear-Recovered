            package com.usercentrics.sdk.p008ui.components;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import androidx.appcompat.widget.AppCompatImageView;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            import p000.C1929mj;
            import p000.C2107qh;
            import p000.C2498yh;
            import p000.C2562zs;
            import p000.av2;
            import p000.bv2;
            import p000.c10;
            import p000.d10;
            import p000.ev2;
            import p000.f42;
            import p000.fv2;
            import p000.gb1;
            import p000.hk2;
            import p000.i03;
            import p000.i13;
            import p000.ig2;
            import p000.m42;
            import p000.m60;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.pi2;
            import p000.r51;
            import p000.w11;
            import p000.xu2;
            import p000.xz2;
            import p000.y00;
            import p000.yu2;
            import p000.yz2;
            import p000.z10;
            import p000.z80;
            import p000.zu2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006&"}, m6176d2 = {"Lcom/usercentrics/sdk/ui/components/UCImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", HttpUrl.FRAGMENT_ENCODE_SET, "imageUrl", HttpUrl.FRAGMENT_ENCODE_SET, "setImageUrl", "(Ljava/lang/String;)V", "Lyz2;", "image", "setImage", "(Lyz2;)V", "Lfv2;", "a", "Lp51;", "getRemoteImageService", "()Lfv2;", "remoteImageService", "Li03;", "b", "getLogger", "()Li03;", "logger", "Lxu2;", "cornerSettings", "Lxu2;", "getCornerSettings", "()Lxu2;", "setCornerSettings", "(Lxu2;)V", "usercentrics-ui_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
/* 22 */    public final class UCImageView extends AppCompatImageView {

                /* JADX INFO: renamed from: a */
                public final hk2 f6248a;

                /* JADX INFO: renamed from: b */
                public final hk2 f6249b;

                /* JADX INFO: renamed from: c */
                public ig2 f6250c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UCImageView(Context context, AttributeSet attributeSet, int i) {
/* 4 */             super(context, attributeSet, i);
/* 1 */             context.getClass();
/* 13 */            this.f6248a = r51.m8065b(C2498yh.f19629j0);
/* 21 */            this.f6249b = r51.m8065b(C2498yh.f19628i0);
                }

                /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
                /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
                /* JADX WARN: Code duplicated, block: B:53:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:54:0x00db  */
                /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Instruction removed from duplicated block: B:50:0x00bd, please report this as an issue */
                /* JADX INFO: renamed from: d */
                public static final Object m2790d(UCImageView uCImageView, String str, d10 d10Var) {
                    zu2 zu2Var;
                    String str2;
                    Object obj;
                    Throwable thM7099a;
                    UCImageView uCImageView2;
                    String str3;
                    Throwable th;
                    i03 logger;
                    UCImageView uCImageView3;
/* 3 */             if (d10Var instanceof zu2) {
/* 6 */                 zu2Var = (zu2) d10Var;
/* 8 */                 int i = zu2Var.f20341i;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zu2Var.f20341i = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zu2Var = new zu2(uCImageView, d10Var);
                        }
                    } else {
/* 22 */                zu2Var = new zu2(uCImageView, d10Var);
                    }
/* 25 */            Object objM4422D = zu2Var.f20339e;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zu2Var.f20341i;
/* 34 */            c10 c10Var = null;
                    try {
                        try {
/* 35 */                    if (i2 != 0) {
/* 37 */                        if (i2 == 1) {
/* 74 */                            uCImageView = (UCImageView) zu2Var.f20337c;
/* 76 */                            str = zu2Var.f20336b;
/* 78 */                            uCImageView3 = zu2Var.f20335a;
                                    try {
/* 80 */                                pg3.m7417A(objM4422D);
                                    } catch (Throwable th2) {
/* 84 */                                th = th2;
/* 85 */                                uCImageView = uCImageView3;
/* 149 */                               m42 m42Var = o42.f14612b;
/* 153 */                               n42 n42Var = new n42(th);
/* 156 */                               str2 = str;
/* 157 */                               obj = n42Var;
/* 158 */                               thM7099a = o42.m7099a(obj);
/* 162 */                               if (thM7099a != null) {
/* 164 */                                   zu2Var.f20335a = uCImageView;
/* 166 */                                   zu2Var.f20336b = str2;
/* 168 */                                   zu2Var.f20337c = obj;
/* 170 */                                   zu2Var.f20338d = thM7099a;
/* 172 */                                   zu2Var.f20341i = 3;
/* 178 */                                   if (w11.m9415Y(zu2Var) == z10Var) {
/* 221 */                                       return z10Var;
                                            }
/* 181 */                                   uCImageView2 = uCImageView;
/* 182 */                                   str3 = str2;
/* 183 */                                   th = thM7099a;
/* 184 */                                   logger = uCImageView2.getLogger();
/* 188 */                                   if (logger != null) {
/* 209 */                                       logger.mo2907b("Error when loading image with URL<" + str3 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                                            }
                                        }
/* 212 */                               m42 m42Var2 = o42.f14612b;
/* 216 */                               if (obj instanceof n42) {
/* 34 */                                    return null;
                                        }
/* 220 */                               return obj;
                                    }
                                } else {
/* 39 */                            if (i2 == 2) {
/* 62 */                                str = zu2Var.f20336b;
/* 64 */                                uCImageView = zu2Var.f20335a;
/* 66 */                                pg3.m7417A(objM4422D);
/* 137 */                               ev2 ev2Var = (ev2) objM4422D;
/* 139 */                               m42 m42Var3 = o42.f14612b;
/* 142 */                               str2 = str;
/* 143 */                               obj = ev2Var;
/* 158 */                               thM7099a = o42.m7099a(obj);
/* 162 */                               if (thM7099a != null) {
/* 164 */                                   zu2Var.f20335a = uCImageView;
/* 166 */                                   zu2Var.f20336b = str2;
/* 168 */                                   zu2Var.f20337c = obj;
/* 170 */                                   zu2Var.f20338d = thM7099a;
/* 172 */                                   zu2Var.f20341i = 3;
/* 178 */                                   if (w11.m9415Y(zu2Var) == z10Var) {
/* 221 */                                       return z10Var;
                                            }
/* 181 */                                   uCImageView2 = uCImageView;
/* 182 */                                   str3 = str2;
/* 183 */                                   th = thM7099a;
                                        }
/* 212 */                               m42 m42Var4 = o42.f14612b;
/* 216 */                               if (obj instanceof n42) {
/* 34 */                                    return null;
                                        }
/* 220 */                               return obj;
                                    }
/* 41 */                            if (i2 != 3) {
/* 58 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 34 */                                return null;
                                    }
/* 43 */                            th = zu2Var.f20338d;
/* 45 */                            obj = zu2Var.f20337c;
/* 47 */                            str3 = zu2Var.f20336b;
/* 49 */                            uCImageView2 = zu2Var.f20335a;
/* 51 */                            pg3.m7417A(objM4422D);
                                }
/* 184 */                       logger = uCImageView2.getLogger();
/* 188 */                       if (logger != null) {
/* 209 */                           logger.mo2907b("Error when loading image with URL<" + str3 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                                }
/* 212 */                       m42 m42Var5 = o42.f14612b;
/* 216 */                       if (obj instanceof n42) {
/* 34 */                            return null;
                                }
/* 220 */                       return obj;
                            }
/* 87 */                    pg3.m7417A(objM4422D);
/* 90 */                    m42 m42Var6 = o42.f14612b;
/* 92 */                    zu2Var.f20335a = uCImageView;
/* 94 */                    zu2Var.f20336b = str;
/* 96 */                    zu2Var.f20337c = uCImageView;
/* 98 */                    zu2Var.f20341i = 1;
/* 104 */                   if (w11.m9415Y(zu2Var) == z10Var) {
/* 221 */                       return z10Var;
                            }
/* 108 */                   uCImageView3 = uCImageView;
/* 117 */                   uCImageView.getClass();
/* 129 */                   objM4422D = i13.m4422D(z80.f19977c, new C2107qh(uCImageView, str, c10Var, 11), zu2Var);
/* 133 */                   if (objM4422D == z10Var) {
/* 221 */                       return z10Var;
                            }
/* 136 */                   uCImageView = uCImageView3;
/* 137 */                   ev2 ev2Var2 = (ev2) objM4422D;
/* 139 */                   m42 m42Var7 = o42.f14612b;
/* 142 */                   str2 = str;
/* 143 */                   obj = ev2Var2;
/* 158 */                   thM7099a = o42.m7099a(obj);
/* 162 */                   if (thM7099a != null) {
/* 164 */                       zu2Var.f20335a = uCImageView;
/* 166 */                       zu2Var.f20336b = str2;
/* 168 */                       zu2Var.f20337c = obj;
/* 170 */                       zu2Var.f20338d = thM7099a;
/* 172 */                       zu2Var.f20341i = 3;
/* 178 */                       if (w11.m9415Y(zu2Var) == z10Var) {
/* 221 */                           return z10Var;
                                }
/* 181 */                       uCImageView2 = uCImageView;
/* 182 */                       str3 = str2;
/* 183 */                       th = thM7099a;
/* 184 */                       logger = uCImageView2.getLogger();
/* 188 */                       if (logger != null) {
/* 209 */                           logger.mo2907b("Error when loading image with URL<" + str3 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                                }
                            }
/* 212 */                   m42 m42Var8 = o42.f14612b;
/* 216 */                   if (obj instanceof n42) {
/* 34 */                        return null;
                            }
/* 220 */                   return obj;
                        } catch (Throwable th3) {
/* 145 */                   th = th3;
/* 85 */                    uCImageView = uCImageView3;
/* 149 */                   m42 m42Var9 = o42.f14612b;
/* 153 */                   n42 n42Var2 = new n42(th);
/* 156 */                   str2 = str;
/* 157 */                   obj = n42Var2;
                        }
/* 109 */               zu2Var.f20335a = uCImageView3;
/* 111 */               zu2Var.f20336b = str;
/* 113 */               zu2Var.f20337c = null;
/* 115 */               zu2Var.f20341i = 2;
                    } catch (Throwable th4) {
/* 70 */                th = th4;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: e */
                public static final Object m2791e(UCImageView uCImageView, String str, byte[] bArr, d10 d10Var) {
                    av2 av2Var;
                    UCImageView uCImageView2;
                    Throwable th;
                    Object n42Var;
                    i03 logger;
/* 3 */             if (d10Var instanceof av2) {
/* 6 */                 av2Var = (av2) d10Var;
/* 8 */                 int i = av2Var.f2115f;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    av2Var.f2115f = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    av2Var = new av2(uCImageView, d10Var);
                        }
                    } else {
/* 22 */                av2Var = new av2(uCImageView, d10Var);
                    }
/* 25 */            Object objM4422D = av2Var.f2113d;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = av2Var.f2115f;
/* 31 */            c10 c10Var = null;
/* 33 */            if (i2 == 0) {
/* 55 */                pg3.m7417A(objM4422D);
                        try {
/* 58 */                    m42 m42Var = o42.f14612b;
/* 60 */                    av2Var.f2110a = uCImageView;
/* 62 */                    av2Var.f2111b = str;
/* 64 */                    av2Var.f2112c = uCImageView;
/* 66 */                    av2Var.f2115f = 1;
/* 77 */                    objM4422D = i13.m4422D(z80.f19977c, new C1929mj(bArr, c10Var, 8), av2Var);
/* 81 */                    if (objM4422D == z10Var) {
/* 83 */                        return z10Var;
                            }
/* 84 */                    uCImageView2 = uCImageView;
                        } catch (Throwable th2) {
/* 96 */                    uCImageView2 = uCImageView;
/* 97 */                    th = th2;
/* 101 */                   m42 m42Var2 = o42.f14612b;
/* 105 */                   n42Var = new n42(th);
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 51 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                uCImageView = av2Var.f2112c;
/* 39 */                str = av2Var.f2111b;
/* 41 */                uCImageView2 = av2Var.f2110a;
                        try {
/* 43 */                    pg3.m7417A(objM4422D);
                        } catch (Throwable th3) {
/* 47 */                    th = th3;
/* 101 */                   m42 m42Var3 = o42.f14612b;
/* 105 */                   n42Var = new n42(th);
                        }
                    }
/* 87 */            uCImageView.setImageBitmap((Bitmap) objM4422D);
/* 90 */            n42Var = Unit.f12910a;
/* 92 */            m42 m42Var4 = o42.f14612b;
/* 109 */           Throwable thM7099a = o42.m7099a(n42Var);
/* 113 */           if (thM7099a != null && (logger = uCImageView2.getLogger()) != null) {
/* 140 */               logger.mo2907b("Error when trying to use image with URL<" + str + "> as a Bitmap", thM7099a);
                    }
/* 143 */           return Unit.f12910a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: f */
                public static final Object m2792f(UCImageView uCImageView, String str, byte[] bArr, d10 d10Var) {
                    bv2 bv2Var;
                    Object n42Var;
                    i03 logger;
/* 3 */             if (d10Var instanceof bv2) {
/* 6 */                 bv2Var = (bv2) d10Var;
/* 8 */                 int i = bv2Var.f2621e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    bv2Var.f2621e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    bv2Var = new bv2(uCImageView, d10Var);
                        }
                    } else {
/* 22 */                bv2Var = new bv2(uCImageView, d10Var);
                    }
/* 25 */            Object obj = bv2Var.f2619c;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = bv2Var.f2621e;
                    try {
/* 33 */                if (i2 == 0) {
/* 53 */                    pg3.m7417A(obj);
/* 56 */                    m42 m42Var = o42.f14612b;
/* 62 */                    String str2 = new String(bArr, Charsets.UTF_8);
/* 65 */                    bv2Var.f2617a = uCImageView;
/* 67 */                    bv2Var.f2618b = str;
/* 69 */                    bv2Var.f2621e = 1;
/* 78 */                    Object objM4422D = i13.m4422D(z80.f19977c, new yu2(str2, uCImageView, null), bv2Var);
/* 82 */                    if (objM4422D != obj2) {
/* 85 */                        objM4422D = Unit.f12910a;
                            }
/* 87 */                    if (objM4422D == obj2) {
/* 89 */                        return obj2;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 49 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    str = bv2Var.f2618b;
/* 39 */                    uCImageView = bv2Var.f2617a;
/* 41 */                    pg3.m7417A(obj);
                        }
/* 90 */                n42Var = Unit.f12910a;
/* 92 */                m42 m42Var2 = o42.f14612b;
                    } catch (Throwable th) {
/* 95 */                m42 m42Var3 = o42.f14612b;
/* 99 */                n42Var = new n42(th);
                    }
/* 103 */           Throwable thM7099a = o42.m7099a(n42Var);
/* 107 */           if (thM7099a != null && (logger = uCImageView.getLogger()) != null) {
/* 119 */               if (thM7099a instanceof NoClassDefFoundError) {
/* 138 */                   logger.mo2907b("Error when trying to use image with URL<" + str + "> as a SVG because the optional SVG module is not present. Please add this module to your application: 'com.pixplicity.sharp'", null);
                        } else {
/* 159 */                   logger.mo2907b("Error when trying to use image with URL<" + str + "> as a SVG", thM7099a);
                        }
                    }
/* 162 */           return Unit.f12910a;
                }

                private final i03 getLogger() {
/* 7 */             return (i03) this.f6249b.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final fv2 getRemoteImageService() {
/* 7 */             return (fv2) this.f6248a.getValue();
                }

                private final void setImageUrl(String imageUrl) {
/* 5 */             pi2 pi2Var = new pi2();
/* 8 */             m60 m60Var = z80.f19975a;
/* 31 */            this.f6250c = i13.m4443w(new y00(AbstractC1844e.m6215c(pi2Var, gb1.f8531a)), null, new C2562zs(this, imageUrl, null, 6), 3);
                }

                public final xu2 getCornerSettings() {
/* 1 */             return null;
                }

                @Override // android.widget.ImageView, android.view.View
                public final void onDraw(Canvas canvas) {
/* 1 */             canvas.getClass();
/* 4 */             super.onDraw(canvas);
                }

                public final void setCornerSettings(xu2 xu2Var) {
                }

                public final void setImage(yz2 image) {
/* 1 */             image.getClass();
/* 6 */             if (image instanceof xz2) {
/* 12 */                setImageUrl(((xz2) image).f19426a);
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 23 */        public UCImageView(Context context, AttributeSet attributeSet) {
/* 24 */            this(context, attributeSet, 0);
                    context.getClass();
                }
            }
