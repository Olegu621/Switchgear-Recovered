            package com.supercell.titan;

            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import java.util.Vector;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import okhttp3.HttpUrl;
            import p000.qj1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class NativeHTTPClientManager {

                /* JADX INFO: renamed from: c */
                public static final Vector f5832c = new Vector();

                /* JADX INFO: renamed from: d */
                public static int f5833d = 1234;

                /* JADX INFO: renamed from: e */
                public static final NativeHTTPClientManager f5834e = new NativeHTTPClientManager();

                /* JADX INFO: renamed from: a */
                public final qj1 f5835a = new qj1();

                /* JADX INFO: renamed from: b */
                public final ExecutorService f5836b = Executors.newCachedThreadPool();

                public static native void getFinished(boolean z, int i, byte[] bArr, int i2);

                public static NativeHTTPClientManager getInstance() {
/* 1 */             return f5834e;
                }

                public static native void postFinished(boolean z, int i, byte[] bArr, int i2);

                public static int startGetRequest(String str, String str2, String str3, String str4) {
/* 1 */             NativeHTTPClientManager nativeHTTPClientManager = getInstance();
/* 9 */             NativeHTTPConnection nativeHTTPConnection = new NativeHTTPConnection(nativeHTTPClientManager.f5835a, str3, str4);
/* 12 */            nativeHTTPConnection.prepareGet(str, str2);
/* 15 */            int i = f5833d;
/* 19 */            f5833d = i + 1;
/* 21 */            nativeHTTPConnection.tag = i;
/* 25 */            nativeHTTPClientManager.f5836b.execute(nativeHTTPConnection);
/* 28 */            return nativeHTTPConnection.tag;
                }

                public static int startPostRequest(String str, String str2, byte[] bArr, String[] strArr, String[] strArr2) {
                    HashMap map;
/* 1 */             NativeHTTPClientManager nativeHTTPClientManager = getInstance();
/* 11 */            NativeHTTPConnection nativeHTTPConnection = new NativeHTTPConnection(nativeHTTPClientManager.f5835a, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
/* 14 */            if (strArr == null || strArr2 == null) {
/* 67 */                map = null;
                    } else if (strArr.length != strArr2.length) {
/* 44 */                AbstractC1245n0.m4889q("NativeHTTPClientManager", String.format("HeaderNames length=%d does not match HeaderValues length=%d.", Integer.valueOf(strArr.length), Integer.valueOf(strArr2.length)));
/* 67 */                map = null;
                    } else {
/* 50 */                map = new HashMap();
/* 55 */                for (int i = 0; i < strArr.length; i++) {
/* 61 */                    map.put(strArr[i], strArr2[i]);
                        }
                    }
/* 68 */            nativeHTTPConnection.preparePost(str, bArr, str2, map);
/* 71 */            int i2 = f5833d;
/* 75 */            f5833d = i2 + 1;
/* 77 */            nativeHTTPConnection.tag = i2;
/* 81 */            nativeHTTPClientManager.f5836b.execute(nativeHTTPConnection);
/* 84 */            return nativeHTTPConnection.tag;
                }

                public void updateBeforeFrame() {
/* 1 */             Vector vector = f5832c;
/* 3 */             int size = vector.size();
/* 9 */             for (int i = 0; i < size; i++) {
/* 15 */                NativeHTTPConnection nativeHTTPConnection = (NativeHTTPConnection) vector.remove(0);
/* 27 */                boolean z = nativeHTTPConnection.getStatus() == NativeHTTPConnection.Status.OK;
/* 28 */                if (!z) {
/* 34 */                    AbstractC1245n0.m4889q("NativeHTTPClientManager", "http fail");
                        }
/* 37 */                int i2 = nativeHTTPConnection.tag;
/* 39 */                byte[] receivedData = nativeHTTPConnection.getReceivedData();
/* 49 */                if (nativeHTTPConnection.getMethod() == NativeHTTPConnection.Method.GET) {
/* 55 */                    getFinished(z, i2, receivedData, nativeHTTPConnection.getResponseCode());
                        } else {
/* 63 */                    postFinished(z, i2, receivedData, nativeHTTPConnection.getResponseCode());
                        }
                    }
                }
            }
