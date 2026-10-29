            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0011\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0000J\u0019\u0010\t\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u001a\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m6176d2 = {"Lokhttp3/internal/http2/Settings;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "headerTableSize", HttpUrl.FRAGMENT_ENCODE_SET, "getHeaderTableSize", "()I", "initialWindowSize", "getInitialWindowSize", "set", "values", HttpUrl.FRAGMENT_ENCODE_SET, "clear", HttpUrl.FRAGMENT_ENCODE_SET, "get", "id", "getEnablePush", HttpUrl.FRAGMENT_ENCODE_SET, "defaultValue", "getMaxConcurrentStreams", "getMaxFrameSize", "getMaxHeaderListSize", "isSet", "merge", "other", FirebaseAnalytics.Param.VALUE, "size", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class Settings {
                public static final int COUNT = 10;
                public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
                public static final int ENABLE_PUSH = 2;
                public static final int HEADER_TABLE_SIZE = 1;
                public static final int INITIAL_WINDOW_SIZE = 7;
                public static final int MAX_CONCURRENT_STREAMS = 4;
                public static final int MAX_FRAME_SIZE = 5;
                public static final int MAX_HEADER_LIST_SIZE = 6;
                private int set;
                private final int[] values = new int[10];

                public final void clear() {
/* 2 */             this.set = 0;
/* 4 */             int[] iArr = this.values;
/* 6 */             int length = iArr.length;
/* 7 */             iArr.getClass();
/* 10 */            Arrays.fill(iArr, 0, length, 0);
                }

                public final int get(int id) {
/* 3 */             return this.values[id];
                }

                public final boolean getEnablePush(boolean defaultValue) {
/* 5 */             if ((this.set & 4) != 0) {
                        return this.values[2] == 1;
                    }
/* 18 */            return defaultValue;
                }

                public final int getHeaderTableSize() {
/* 5 */             if ((this.set & 2) != 0) {
/* 10 */                return this.values[1];
                    }
/* 13 */            return -1;
                }

                public final int getInitialWindowSize() {
                    return (this.set & 128) != 0 ? this.values[7] : DEFAULT_INITIAL_WINDOW_SIZE;
                }

                public final int getMaxConcurrentStreams() {
                    return (this.set & 16) != 0 ? this.values[4] : AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final int getMaxFrameSize(int defaultValue) {
                    return (this.set & 32) != 0 ? this.values[5] : defaultValue;
                }

                public final int getMaxHeaderListSize(int defaultValue) {
                    return (this.set & 64) != 0 ? this.values[6] : defaultValue;
                }

                public final boolean isSet(int id) {
                    return (this.set & (1 << id)) != 0;
                }

                public final void merge(Settings other) {
/* 1 */             other.getClass();
/* 4 */             int i = 0;
/* 7 */             while (i < 10) {
/* 9 */                 int i2 = i + 1;
/* 15 */                if (other.isSet(i)) {
/* 22 */                    set(i, other.get(i));
                        }
/* 25 */                i = i2;
                    }
                }

                public final Settings set(int id, int value) {
/* 1 */             if (id >= 0) {
/* 3 */                 int[] iArr = this.values;
/* 6 */                 if (id < iArr.length) {
/* 14 */                    this.set = (1 << id) | this.set;
/* 16 */                    iArr[id] = value;
                        }
                    }
/* 18 */            return this;
                }

                public final int size() {
/* 3 */             return Integer.bitCount(this.set);
                }
            }
