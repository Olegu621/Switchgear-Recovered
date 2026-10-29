            package kotlin.p011io;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m6176d2 = {"Lkotlin/io/FileWalkDirection;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final class FileWalkDirection {

                /* JADX INFO: renamed from: a */
                public static final FileWalkDirection f12920a;

                /* JADX INFO: renamed from: b */
                public static final FileWalkDirection f12921b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ FileWalkDirection[] f12922c;

                static {
/* 6 */             FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
/* 9 */             f12920a = fileWalkDirection;
/* 16 */            FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
/* 19 */            f12921b = fileWalkDirection2;
/* 25 */            f12922c = new FileWalkDirection[]{fileWalkDirection, fileWalkDirection2};
                }

                public static FileWalkDirection valueOf(String str) {
/* 7 */             return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
                }

                public static FileWalkDirection[] values() {
/* 7 */             return (FileWalkDirection[]) f12922c.clone();
                }
            }
