            package com.google.android.gms.internal.auth;

            import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.UnsupportedEncodingException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzbz extends FastSafeParcelableJsonResponse {
                public final byte[] toByteArray() {
                    try {
/* 7 */                 return toString().getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e) {
/* 17 */                AbstractC1245n0.m4877e("AUTH", "Error serializing object.", e);
/* 20 */                return null;
                    }
                }
            }
