            package com.google.android.recaptcha.internal;

            import java.util.Collections;
            import java.util.Comparator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzor {
                private static final Comparator zza = new zzok();
                private static final zzor zzb = new zzor(new zzop(Collections.EMPTY_LIST));
                private final zzop zzc;

                private zzor(zzop zzopVar) {
/* 4 */             this.zzc = zzopVar;
                }

                public static zzor zza() {
/* 1 */             return zzb;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof zzor) && ((zzor) obj).zzc.equals(this.zzc);
                }

                public final int hashCode() {
/* 7 */             return ~this.zzc.hashCode();
                }

                public final String toString() {
/* 3 */             return this.zzc.toString();
                }
            }
