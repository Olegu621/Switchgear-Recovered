            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.Log;
            import android.util.SparseIntArray;
            import com.google.android.gms.internal.cloudmessaging.zze;
            import com.google.android.gms.internal.play_billing.zzej;
            import com.google.android.gms.tasks.Task;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.NoSuchAlgorithmException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeoutException;
            import java.util.function.Consumer;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 149 */   public final class ur3 implements yw1, zzej {

                /* JADX INFO: renamed from: e */
                public static ur3 f17700e;

                /* JADX INFO: renamed from: f */
                public static HandlerThread f17701f;

                /* JADX INFO: renamed from: i */
                public static Handler f17702i;

                /* JADX INFO: renamed from: a */
                public int f17703a;

                /* JADX INFO: renamed from: b */
                public Object f17704b;

                /* JADX INFO: renamed from: c */
                public final Object f17705c;

                /* JADX INFO: renamed from: d */
                public Object f17706d;

                public ur3(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
/* 6 */             zw1 zw1Var = new zw1(this);
/* 9 */             this.f17704b = zw1Var;
/* 16 */            if (!pm2.m7479b(2)) {
/* 146 */               ds0.m3203t("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
/* 150 */               throw null;
                    }
/* 18 */            this.f17705c = str;
/* 20 */            this.f17706d = secretKeySpec;
/* 29 */            if (secretKeySpec.getEncoded().length < 16) {
/* 143 */               throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
                    }
                    switch (str) {
                        case "HMACSHA1":
/* 130 */                   this.f17703a = 20;
                            break;
                        case "HMACSHA224":
/* 125 */                   this.f17703a = 28;
                            break;
                        case "HMACSHA256":
/* 120 */                   this.f17703a = 32;
                            break;
                        case "HMACSHA384":
/* 115 */                   this.f17703a = 48;
                            break;
                        case "HMACSHA512":
/* 110 */                   this.f17703a = 64;
                            break;
                        default:
/* 107 */                   throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                    }
/* 132 */           zw1Var.get();
                }

                /* JADX INFO: renamed from: b */
                public static void m9132b(SparseIntArray sparseIntArray, long j) {
/* 1 */             if (sparseIntArray != null) {
/* 11 */                int i = (int) ((500000 + j) / 1000000);
/* 16 */                if (j >= 0) {
/* 24 */                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public static synchronized ur3 m9133c(Context context) {
                    try {
/* 6 */                 if (f17700e == null) {
/* 10 */                    zze.zza();
/* 32 */                    f17700e = new ur3(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new hl1("MessengerIpcClient"))));
                        }
                    } catch (Throwable th) {
/* 42 */                throw th;
                    }
/* 37 */            return f17700e;
                }

                @Override // p000.yw1
                /* JADX INFO: renamed from: a */
                public byte[] mo172a(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
/* 3 */             zw1 zw1Var = (zw1) this.f17704b;
/* 7 */             if (i > this.f17703a) {
/* 40 */                throw new InvalidAlgorithmParameterException("tag size too big");
                    }
/* 15 */            ((Mac) zw1Var.get()).update(bArr);
/* 28 */            return Arrays.copyOf(((Mac) zw1Var.get()).doFinal(), i);
                }

                /* JADX INFO: renamed from: d */
                public synchronized Task m9134d(vq3 vq3Var) {
                    try {
/* 9 */                 if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 17 */                    "Queueing ".concat(vq3Var.toString());
                        }
/* 31 */                if (!((gp3) this.f17706d).m3986d(vq3Var)) {
/* 35 */                    gp3 gp3Var = new gp3(this);
/* 38 */                    this.f17706d = gp3Var;
/* 40 */                    gp3Var.m3986d(vq3Var);
                        }
                    } catch (Throwable th) {
/* 52 */                throw th;
                    }
/* 45 */            return vq3Var.f18319b.getTask();
                }

                @Override // com.google.android.gms.internal.play_billing.zzej
                public void zza(Throwable th) {
/* 1 */             boolean z = th instanceof TimeoutException;
/* 5 */             gf3 gf3Var = (gf3) this.f17706d;
/* 11 */            if (z) {
/* 17 */                gf3Var.m3920G(114, 28, kf3.f12741s);
/* 22 */                com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
                    } else {
/* 30 */                gf3Var.m3920G(107, 28, kf3.f12741s);
/* 35 */                com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
                    }
/* 42 */            ((Runnable) this.f17705c).run();
                }

                @Override // com.google.android.gms.internal.play_billing.zzej
                public void zzb(Object obj) {
/* 1 */             Integer num = (Integer) obj;
/* 3 */             int iIntValue = num.intValue();
/* 9 */             gf3 gf3Var = (gf3) this.f17706d;
/* 11 */            if (iIntValue <= 0) {
/* 42 */                ((Runnable) this.f17705c).run();
/* 45 */                return;
                    }
/* 13 */            int i = this.f17703a;
/* 21 */            C1833kj c1833kjM6096a = kf3.m6096a(num.intValue(), "Billing override value was set by a license tester.");
/* 27 */            gf3Var.m3920G(105, i, c1833kjM6096a);
/* 34 */            ((Consumer) this.f17704b).accept(c1833kjM6096a);
                }

/* 150 */       public ur3(Context context, ScheduledExecutorService scheduledExecutorService) {
                    this.f17706d = new gp3(this);
                    this.f17703a = 1;
                    this.f17705c = scheduledExecutorService;
/* 152 */           this.f17704b = context.getApplicationContext();
                }

/* 152 */       public ur3(ju1 ju1Var, lu1 lu1Var, int i, EnumC0958gl enumC0958gl) {
/* 154 */           this.f17704b = ju1Var;
/* 155 */           this.f17705c = lu1Var;
/* 156 */           this.f17703a = i;
/* 157 */           this.f17706d = enumC0958gl;
                }

/* 157 */       public ur3(int i, String str, String str2, String str3) {
                    if (i != 0) {
/* 159 */               this.f17703a = i;
/* 160 */               this.f17704b = str;
/* 161 */               this.f17705c = str2;
/* 162 */               this.f17706d = str3;
                        return;
                    }
/* 163 */           throw null;
                }

/* 163 */       public ur3(int i, String str, HashMap map, String str2) {
/* 165 */           this.f17703a = i;
/* 166 */           this.f17704b = str;
/* 167 */           this.f17705c = map;
/* 168 */           this.f17706d = str2;
                }

/* 168 */       public ur3(gf3 gf3Var, int i, Consumer consumer, Runnable runnable) {
                    this.f17703a = i;
                    this.f17704b = consumer;
                    this.f17705c = runnable;
                    this.f17706d = gf3Var;
                }

/* 169 */       public ur3(int i) {
/* 171 */           this.f17704b = new SparseIntArray[9];
/* 172 */           this.f17705c = new ArrayList();
/* 173 */           this.f17706d = new sn0(this);
/* 174 */           this.f17703a = i;
                }
            }
