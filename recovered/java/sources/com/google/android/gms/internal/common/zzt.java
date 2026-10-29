            package com.google.android.gms.internal.common;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.Objects;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzt implements Iterable {
                final /* synthetic */ CharSequence zza;
                final /* synthetic */ zzw zzb;

                public zzt(zzw zzwVar, CharSequence charSequence) {
/* 1 */             this.zza = charSequence;
/* 3 */             Objects.requireNonNull(zzwVar);
/* 6 */             this.zzb = zzwVar;
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 5 */             return this.zzb.zze(this.zza);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append('[');
/* 13 */            Iterator it = iterator();
                    try {
/* 21 */                if (it.hasNext()) {
/* 31 */                    sb.append(zzq.zza(it.next(), ", "));
/* 38 */                    while (it.hasNext()) {
/* 40 */                        sb.append((CharSequence) ", ");
/* 51 */                        sb.append(zzq.zza(it.next(), ", "));
                            }
                        }
/* 57 */                sb.append(']');
/* 60 */                return sb.toString();
                    } catch (IOException e) {
/* 66 */                C1951n4.m6856g(e);
/* 69 */                return null;
                    }
                }
            }
