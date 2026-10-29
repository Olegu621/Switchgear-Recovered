            package com.google.android.play.core.integrity.model;

            import java.lang.annotation.ElementType;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.annotation.Target;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Target({ElementType.TYPE_USE, ElementType.PARAMETER})
            @Retention(RetentionPolicy.SOURCE)
            public @interface IntegrityDialogTypeCode {
                public static final int CLOSE_ALL_ACCESS_RISK = 3;
                public static final int CLOSE_UNKNOWN_ACCESS_RISK = 2;
                public static final int GET_LICENSED = 1;
            }
