            package com.google.android.gms.common.internal;

            import android.app.PendingIntent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Message;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.internal.common.zzg;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.ad3;
            import p000.fm0;
            
            /* JADX INFO: renamed from: com.google.android.gms.common.internal.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class HandlerC0324c extends zzg {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0322a f3522a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HandlerC0324c(AbstractC0322a abstractC0322a, Looper looper) {
/* 3 */             super(looper);
/* 1 */             this.f3522a = abstractC0322a;
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Boolean bool;
                    ad3 ad3Var;
/* 1 */             AbstractC0322a abstractC0322a = this.f3522a;
/* 5 */             int i = abstractC0322a.zzd.get();
/* 9 */             int i2 = message.arg1;
/* 11 */            int i3 = message.what;
/* 17 */            if (i != i2) {
/* 19 */                if ((i3 == 2 || i3 == 1 || i3 == 7) && (ad3Var = (ad3) message.obj) != null) {
                            synchronized (ad3Var) {
/* 34 */                        ad3Var.f190a = null;
                            }
/* 37 */                    AbstractC0322a abstractC0322a2 = ad3Var.f192c;
                            synchronized (abstractC0322a2.zzj()) {
/* 48 */                        abstractC0322a2.zzj().remove(ad3Var);
                            }
/* 52 */                    return;
                        }
/* 479 */               return;
                    }
/* 61 */            if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !abstractC0322a.enableLocalFallback()) || message.what == 5)) && !abstractC0322a.isConnecting()) {
/* 449 */               ad3 ad3Var2 = (ad3) message.obj;
/* 451 */               if (ad3Var2 != null) {
                            synchronized (ad3Var2) {
/* 454 */                       ad3Var2.f190a = null;
                            }
/* 457 */                   AbstractC0322a abstractC0322a3 = ad3Var2.f192c;
                            synchronized (abstractC0322a3.zzj()) {
/* 468 */                       abstractC0322a3.zzj().remove(ad3Var2);
                            }
/* 472 */                   return;
                        }
/* 479 */               return;
                    }
/* 83 */            int i4 = message.what;
/* 88 */            if (i4 == 4) {
/* 97 */                abstractC0322a.zzn(new ConnectionResult(message.arg2, null, null));
/* 104 */               if (abstractC0322a.zzg() && !abstractC0322a.zzo()) {
/* 113 */                   abstractC0322a.zzd(3, null);
/* 116 */                   return;
                        }
/* 130 */               ConnectionResult connectionResultZzm = abstractC0322a.zzm() != null ? abstractC0322a.zzm() : new ConnectionResult(8, null, null);
/* 135 */               abstractC0322a.zzc.mo3444f(connectionResultZzm);
/* 138 */               abstractC0322a.onConnectionFailed(connectionResultZzm);
/* 141 */               return;
                    }
/* 142 */           if (i4 == 5) {
/* 157 */               ConnectionResult connectionResultZzm2 = abstractC0322a.zzm() != null ? abstractC0322a.zzm() : new ConnectionResult(8, null, null);
/* 162 */               abstractC0322a.zzc.mo3444f(connectionResultZzm2);
/* 165 */               abstractC0322a.onConnectionFailed(connectionResultZzm2);
/* 168 */               return;
                    }
/* 169 */           if (i4 == 3) {
/* 171 */               Object obj = message.obj;
/* 185 */               ConnectionResult connectionResult = new ConnectionResult(message.arg2, null, obj instanceof PendingIntent ? (PendingIntent) obj : null);
/* 190 */               abstractC0322a.zzc.mo3444f(connectionResult);
/* 193 */               abstractC0322a.onConnectionFailed(connectionResult);
/* 196 */               return;
                    }
/* 198 */           if (i4 == 6) {
/* 200 */               abstractC0322a.zzd(5, null);
/* 207 */               if (abstractC0322a.zzk() != null) {
/* 215 */                   abstractC0322a.zzk().mo196a(message.arg2);
                        }
/* 220 */               abstractC0322a.onConnectionSuspended(message.arg2);
/* 223 */               abstractC0322a.zze(5, 1, null);
/* 226 */               return;
                    }
/* 227 */           if (i4 == 2 && !abstractC0322a.isConnected()) {
/* 238 */               ad3 ad3Var3 = (ad3) message.obj;
/* 240 */               if (ad3Var3 != null) {
                            synchronized (ad3Var3) {
/* 243 */                       ad3Var3.f190a = null;
                            }
/* 246 */                   AbstractC0322a abstractC0322a4 = ad3Var3.f192c;
                            synchronized (abstractC0322a4.zzj()) {
/* 257 */                       abstractC0322a4.zzj().remove(ad3Var3);
                            }
/* 261 */                   return;
                        }
/* 479 */               return;
                    }
/* 268 */           int i5 = message.what;
/* 270 */           if (i5 != 2 && i5 != 1 && i5 != 7) {
/* 305 */               AbstractC1245n0.m4893u("GmsClient", fm0.m3788n(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
/* 308 */               return;
                    }
/* 311 */           ad3 ad3Var4 = (ad3) message.obj;
                    synchronized (ad3Var4) {
                        try {
/* 318 */                   bool = ad3Var4.f190a;
/* 322 */                   if (ad3Var4.f191b) {
/* 326 */                       String string = ad3Var4.toString();
/* 338 */                       StringBuilder sb = new StringBuilder(string.length() + 47);
/* 341 */                       sb.append("Callback proxy ");
/* 344 */                       sb.append(string);
/* 347 */                       sb.append(" being reused. This is not safe.");
/* 354 */                       AbstractC1245n0.m4889q("GmsClient", sb.toString());
                            }
                        } catch (Throwable th) {
/* 446 */                   throw th;
                        }
                    }
/* 361 */           if (bool != null) {
/* 363 */               AbstractC0322a abstractC0322a5 = ad3Var4.f195f;
/* 365 */               int i6 = ad3Var4.f193d;
/* 367 */               if (i6 != 0) {
/* 387 */                   abstractC0322a5.zzd(1, null);
/* 390 */                   Bundle bundle = ad3Var4.f194e;
/* 409 */                   ad3Var4.mo206b(new ConnectionResult(i6, null, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC0322a.KEY_PENDING_INTENT) : null));
                        } else if (!ad3Var4.mo205a()) {
/* 375 */                   abstractC0322a5.zzd(1, null);
/* 383 */                   ad3Var4.mo206b(new ConnectionResult(8, null, null));
                        }
                    }
                    synchronized (ad3Var4) {
/* 413 */               ad3Var4.f191b = true;
                    }
                    synchronized (ad3Var4) {
/* 417 */               ad3Var4.f190a = null;
                    }
/* 420 */           AbstractC0322a abstractC0322a6 = ad3Var4.f192c;
                    synchronized (abstractC0322a6.zzj()) {
/* 431 */               abstractC0322a6.zzj().remove(ad3Var4);
                    }
                }
            }
