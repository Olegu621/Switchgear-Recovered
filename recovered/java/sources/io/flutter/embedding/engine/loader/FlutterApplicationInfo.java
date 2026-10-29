            package io.flutter.embedding.engine.loader;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FlutterApplicationInfo {
                private static final String DEFAULT_AOT_SHARED_LIBRARY_NAME = "libapp.so";
                private static final String DEFAULT_FLUTTER_ASSETS_DIR = "flutter_assets";
                private static final String DEFAULT_ISOLATE_SNAPSHOT_DATA = "isolate_snapshot_data";
                private static final String DEFAULT_VM_SNAPSHOT_DATA = "vm_snapshot_data";
                public final String aotSharedLibraryName;
                final boolean automaticallyRegisterPlugins;
                public final String domainNetworkPolicy;
                public final String flutterAssetsDir;
                public final String isolateSnapshotData;
                public final String nativeLibraryDir;
                public final String vmSnapshotData;

                public FlutterApplicationInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
/* 8 */             this.aotSharedLibraryName = str == null ? DEFAULT_AOT_SHARED_LIBRARY_NAME : str;
/* 14 */            this.vmSnapshotData = str2 == null ? DEFAULT_VM_SNAPSHOT_DATA : str2;
/* 20 */            this.isolateSnapshotData = str3 == null ? DEFAULT_ISOLATE_SNAPSHOT_DATA : str3;
/* 26 */            this.flutterAssetsDir = str4 == null ? DEFAULT_FLUTTER_ASSETS_DIR : str4;
/* 28 */            this.nativeLibraryDir = str6;
/* 34 */            this.domainNetworkPolicy = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
/* 36 */            this.automaticallyRegisterPlugins = z;
                }
            }
