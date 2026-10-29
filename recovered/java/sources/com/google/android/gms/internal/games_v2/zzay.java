            package com.google.android.gms.internal.games_v2;

            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class zzay {
                public static /* synthetic */ boolean zza(AtomicReference atomicReference, Object obj, Object obj2) {
/* 5 */             while (!atomicReference.compareAndSet(obj, obj2)) {
/* 13 */                if (atomicReference.get() != obj && atomicReference.get() != obj) {
/* 21 */                    return false;
                        }
                    }
/* 7 */             return true;
                }
            }
