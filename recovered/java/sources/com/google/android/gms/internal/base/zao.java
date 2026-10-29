            package com.google.android.gms.internal.base;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
            import p000.v00;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zao extends v00 {
                @ResultIgnorabilityUnspecified
                @Deprecated
                public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
/* 5 */             if (zan.zaa()) {
/* 1 */                 return context.registerReceiver(broadcastReceiver, intentFilter, true != zan.zaa() ? 0 : 2);
                    }
/* 22 */            return context.registerReceiver(broadcastReceiver, intentFilter);
                }
            }
