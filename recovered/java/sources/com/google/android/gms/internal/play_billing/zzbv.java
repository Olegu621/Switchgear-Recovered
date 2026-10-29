            package com.google.android.gms.internal.play_billing;

            import java.util.Objects;
            import java.util.function.BiConsumer;
            import java.util.function.BinaryOperator;
            import java.util.function.Function;
            import java.util.function.Supplier;
            import java.util.stream.Collector;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbv {
                private static final Collector zza = Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbj
                    @Override // java.util.function.Supplier
                    public final Object get() {
/* 4 */                 return new zzck(4);
                    }
                }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbm
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
/* 3 */                 ((zzck) obj).zzd(obj2);
                    }
                }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbn
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
/* 1 */                 zzck zzckVar = (zzck) obj;
/* 3 */                 zzck zzckVar2 = (zzck) obj2;
/* 9 */                 zzckVar.zzb(zzckVar2.zza, zzckVar2.zzb);
/* 12 */                return zzckVar;
                    }
                }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbo
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
/* 3 */                 return ((zzck) obj).zze();
                    }
                }, new Collector.Characteristics[0]);

                static {
/* 52 */            Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbp
                        @Override // java.util.function.Supplier
                        public final Object get() {
/* 3 */                     return new zzcu();
                        }
                    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbq
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
/* 3 */                     ((zzcu) obj).zzd(obj2);
                        }
                    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbr
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
/* 1 */                     zzcu zzcuVar = (zzcu) obj;
/* 3 */                     zzcu zzcuVar2 = (zzcu) obj2;
/* 9 */                     zzcuVar.zzb(zzcuVar2.zza, zzcuVar2.zzb);
/* 12 */                    return zzcuVar;
                        }
                    }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbs
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
/* 1 */                     zzcu zzcuVar = (zzcu) obj;
/* 3 */                     int i = zzcuVar.zzb;
/* 5 */                     if (i == 0) {
/* 37 */                        return zzdq.zza;
                            }
/* 7 */                     Object[] objArr = zzcuVar.zza;
/* 10 */                    if (i == 1) {
/* 26 */                        Object obj2 = objArr[0];
/* 28 */                        Objects.requireNonNull(obj2);
/* 33 */                        return new zzdt(obj2);
                            }
/* 1 */                     zzcv zzcvVarZzl = zzcv.zzl(i, objArr);
/* 20 */                    zzcuVar.zzb = zzcvVarZzl.size();
/* 22 */                    zzcuVar.zzc = true;
/* 24 */                    return zzcvVarZzl;
                        }
                    }, new Collector.Characteristics[0]);
/* 77 */            Collector.of(new Supplier() { // from class: com.google.android.gms.internal.play_billing.zzbt
                        @Override // java.util.function.Supplier
                        public final Object get() {
/* 3 */                     return new zzcs();
                        }
                    }, new BiConsumer() { // from class: com.google.android.gms.internal.play_billing.zzbu
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
/* 5 */                     ((zzcs) obj).zza((zzdh) obj2);
                        }
                    }, new BinaryOperator() { // from class: com.google.android.gms.internal.play_billing.zzbk
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
/* 1 */                     zzcs zzcsVar = (zzcs) obj;
/* 5 */                     zzcsVar.zzb((zzcs) obj2);
/* 8 */                     return zzcsVar;
                        }
                    }, new Function() { // from class: com.google.android.gms.internal.play_billing.zzbl
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
/* 3 */                     return ((zzcs) obj).zzc();
                        }
                    }, new Collector.Characteristics[0]);
                }

                public static Collector zza() {
/* 1 */             return zza;
                }
            }
