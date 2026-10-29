            package com.google.android.recaptcha.internal;

            import java.util.Locale;
            import java.util.concurrent.TimeUnit;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzmf {
                private boolean zza;
                private long zzb;
                private long zzc;

                public static zzmf zzb() {
/* 3 */             zzmf zzmfVar = new zzmf();
/* 6 */             zzmfVar.zze();
/* 9 */             return zzmfVar;
                }

                public static zzmf zzc() {
/* 3 */             return new zzmf();
                }

                private final long zzg() {
                    return this.zza ? (System.nanoTime() - this.zzc) + this.zzb : this.zzb;
                }

                public final String toString() {
                    TimeUnit timeUnit;
                    String str;
/* 1 */             long jZzg = zzg();
/* 10 */            long j = jZzg / 86400000000000L;
/* 16 */            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
/* 18 */            if (j > 0) {
/* 20 */                timeUnit = TimeUnit.DAYS;
                    } else if (jZzg / 3600000000000L > 0) {
/* 34 */                timeUnit = TimeUnit.HOURS;
                    } else if (jZzg / 60000000000L > 0) {
/* 48 */                timeUnit = TimeUnit.MINUTES;
                    } else if (jZzg / 1000000000 > 0) {
/* 60 */                timeUnit = TimeUnit.SECONDS;
                    } else if (jZzg / 1000000 > 0) {
/* 72 */                timeUnit = TimeUnit.MILLISECONDS;
                    } else {
/* 86 */                timeUnit = jZzg / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
                    }
/* 108 */           String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZzg / timeUnit2.convert(1L, timeUnit)));
                    switch (zzme.zza[timeUnit.ordinal()]) {
                        case 1:
/* 147 */                   str = "ns";
                            break;
                        case 2:
/* 144 */                   str = "μs";
                            break;
                        case 3:
/* 141 */                   str = "ms";
                            break;
                        case 4:
/* 138 */                   str = "s";
                            break;
                        case 5:
/* 135 */                   str = "min";
                            break;
                        case 6:
/* 132 */                   str = "h";
                            break;
                        case 7:
/* 129 */                   str = "d";
                            break;
                        default:
/* 128 */                   throw new AssertionError();
                    }
/* 151 */           return AbstractC0886en.m3508l(str2, " ", str);
                }

                public final long zza(TimeUnit timeUnit) {
/* 7 */             return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
                }

                public final zzmf zzd() {
/* 3 */             this.zzb = 0L;
/* 6 */             this.zza = false;
/* 8 */             return this;
                }

                public final zzmf zze() {
/* 7 */             zzmd.zze(!this.zza, "This stopwatch is already running.");
/* 10 */            this.zza = true;
/* 16 */            this.zzc = System.nanoTime();
/* 18 */            return this;
                }

                public final zzmf zzf() {
/* 1 */             long jNanoTime = System.nanoTime();
/* 9 */             zzmd.zze(this.zza, "This stopwatch is already stopped.");
/* 13 */            this.zza = false;
/* 21 */            this.zzb = (jNanoTime - this.zzc) + this.zzb;
/* 23 */            return this;
                }
            }
