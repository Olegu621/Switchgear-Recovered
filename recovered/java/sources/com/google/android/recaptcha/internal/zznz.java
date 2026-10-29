            package com.google.android.recaptcha.internal;

            import android.os.Build;
            import java.util.concurrent.ConcurrentLinkedQueue;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznz extends zzns {
                static final boolean zza;
                static final boolean zzb;
                static final boolean zzc;
                private static final AtomicReference zzd;
                private static final AtomicLong zze;
                private static final ConcurrentLinkedQueue zzf;
                private volatile zznb zzg;

                static {
/* 1 */             String str = Build.FINGERPRINT;
/* 18 */            zza = str == null || "robolectric".equals(str);
/* 20 */            String str2 = Build.HARDWARE;
/* 41 */            zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
/* 43 */            String str3 = Build.TYPE;
/* 62 */            zzc = "eng".equals(str3) || "userdebug".equals(str3);
/* 69 */            zzd = new AtomicReference();
/* 76 */            zze = new AtomicLong();
/* 83 */            zzf = new ConcurrentLinkedQueue();
                }

                private zznz(String str) {
/* 1 */             super(str);
/* 6 */             if (zza || zzb) {
/* 54 */                this.zzg = new zznt().zza(zza());
                    } else if (zzc) {
/* 34 */                this.zzg = zzoe.zzc().zzb(false).zza(zza());
                    } else {
/* 38 */                this.zzg = null;
                    }
                }

                public static zznb zzb(String str) {
                    char cCharAt;
/* 1 */             AtomicReference atomicReference = zzd;
/* 7 */             if (atomicReference.get() != null) {
/* 15 */                return ((zznu) atomicReference.get()).zza(str);
                    }
/* 22 */            int length = str.length();
/* 45 */            do {
/* 26 */                length--;
/* 28 */                if (length < 0) {
                            break;
                        }
/* 30 */                cCharAt = str.charAt(length);
/* 38 */                if (cCharAt == '$') {
/* 40 */                    str = str.replace('$', '.');
                            break;
                        }
/* 45 */            } while (cCharAt != '.');
/* 48 */            zznz zznzVar = new zznz(str);
/* 51 */            ConcurrentLinkedQueue concurrentLinkedQueue = zznx.zza;
/* 53 */            concurrentLinkedQueue.offer(zznzVar);
/* 60 */            if (atomicReference.get() != null) {
                        while (true) {
/* 66 */                    zznz zznzVar2 = (zznz) concurrentLinkedQueue.poll();
/* 68 */                    if (zznzVar2 == null) {
                                break;
                            }
/* 84 */                    zznzVar2.zzg = ((zznu) atomicReference.get()).zza(zznzVar2.zza());
                        }
/* 95 */                if (((zzny) zzf.poll()) != null) {
/* 100 */                   zze.getAndDecrement();
/* 104 */                   throw null;
                        }
                    }
/* 105 */           return zznzVar;
                }
            }
