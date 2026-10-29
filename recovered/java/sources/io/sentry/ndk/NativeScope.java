            package io.sentry.ndk;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class NativeScope {
                public static native void nativeAddAttachment(String str);

                public static native void nativeAddAttachmentBytes(byte[] bArr, String str);

                public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

                public static native void nativeClearAttachments();

                public static native void nativeSetTrace(String str, String str2);
            }
