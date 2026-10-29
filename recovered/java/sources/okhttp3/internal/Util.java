            package okhttp3.internal;

            import android.support.v4.media.session.PlaybackStateCompat;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import io.flutter.plugin.editing.SpellCheckPlugin;
            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.File;
            import java.io.IOException;
            import java.io.InterruptedIOException;
            import java.lang.reflect.Field;
            import java.net.InetSocketAddress;
            import java.net.ServerSocket;
            import java.net.Socket;
            import java.net.SocketAddress;
            import java.net.SocketTimeoutException;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.TimeZone;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.IntRange;
            import kotlin.text.C1852e;
            import kotlin.text.Charsets;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.Call;
            import okhttp3.EventListener;
            import okhttp3.Headers;
            import okhttp3.HttpUrl;
            import okhttp3.MediaType;
            import okhttp3.OkHttpClient;
            import okhttp3.RequestBody;
            import okhttp3.Response;
            import okhttp3.ResponseBody;
            import okhttp3.internal.Util;
            import okhttp3.internal.http2.Header;
            import okhttp3.internal.p012io.FileSystem;
            import okio.Buffer;
            import okio.BufferedSink;
            import okio.BufferedSource;
            import okio.ByteString;
            import okio.Options;
            import okio.Sink;
            import okio.Source;
            import p000.AbstractC0208c9;
            import p000.C1951n4;
            import p000.C2085pw;
            import p000.C2122qw;
            import p000.C2126r;
            import p000.C2357x6;
            import p000.ds0;
            import p000.f42;
            import p000.gs2;
            import p000.jb1;
            import p000.jf0;
            import p000.nd0;
            import p000.od0;
            import p000.r02;
            import p000.s80;
            import p000.wy0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000Â\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010,\u001a\u0011\u0010-\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b-\u0010.\u001a\u0011\u0010/\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b/\u00100\u001a\u0015\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b1\u00100\u001a)\u00102\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002030\u000e\"\u000203¢\u0006\u0004\b2\u00105\u001a\u0019\u00109\u001a\u000207*\u0002062\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:\u001a'\u0010>\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010@\u001a\u00020\u001b*\u00020*¢\u0006\u0004\b@\u0010A\u001a\u0017\u0010E\u001a\u00020D*\b\u0012\u0004\u0012\u00020C0B¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020C0B*\u00020D¢\u0006\u0004\bG\u0010H\u001a\u0019\u0010I\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bI\u0010J\u001a\u0011\u0010M\u001a\u00020L*\u00020K¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010Q\u001a\u00020\u001b*\u00020O2\u0006\u0010P\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010Q\u001a\u00020\u001b*\u00020S2\u0006\u0010P\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bQ\u0010T\u001a\u001c\u0010Q\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010P\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bQ\u0010U\u001a\u0019\u0010X\u001a\u00020\u0004*\u00020V2\u0006\u0010W\u001a\u00020\u001b¢\u0006\u0004\bX\u0010Y\u001a\u0011\u0010Z\u001a\u00020\u001b*\u000206¢\u0006\u0004\bZ\u0010[\u001a!\u0010^\u001a\u00020\t*\u00020\\2\u0006\u0010;\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020<¢\u0006\u0004\b^\u0010_\u001a!\u0010a\u001a\u00020\t*\u00020\\2\u0006\u0010`\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020<¢\u0006\u0004\ba\u0010_\u001a\u0011\u0010c\u001a\u00020\u0007*\u00020b¢\u0006\u0004\bc\u0010d\u001a\u0019\u0010f\u001a\u00020\t*\u00020b2\u0006\u0010e\u001a\u000206¢\u0006\u0004\bf\u0010g\u001a!\u0010j\u001a\u00020\u00042\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0086\bø\u0001\u0000¢\u0006\u0004\bj\u0010k\u001a)\u0010l\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0086\bø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0019\u0010^\u001a\u00020\u001b*\u00020n2\u0006\u0010o\u001a\u00020O¢\u0006\u0004\b^\u0010p\u001a\u001b\u0010q\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bq\u0010r\u001a\u0011\u0010t\u001a\u00020\u0000*\u00020s¢\u0006\u0004\bt\u0010u\u001a\u0019\u0010w\u001a\u00020\u0000*\u00020\u00072\u0006\u0010v\u001a\u00020\u0000¢\u0006\u0004\bw\u0010x\u001a\u001b\u0010y\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010v\u001a\u00020\u001b¢\u0006\u0004\by\u0010r\u001a#\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000B¢\u0006\u0004\b{\u0010|\u001a/\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z2\u0012\u0010}\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0004\b~\u0010\u007f\u001a<\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001\"\u0005\b\u0000\u0010\u0080\u0001\"\u0005\b\u0001\u0010\u0081\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0085\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0014\u0010\u0086\u0001\u001a\u00020\u0004*\u00020b¢\u0006\u0006\b\u0086\u0001\u0010\u0088\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0089\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u008a\u0001\u001a\u001f\u0010\u008e\u0001\u001a\u00020\t*\u00030\u008b\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0014\u0010\u0090\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u0090\u0001\u0010\u0092\u0001\u001a\u0017\u0010\u0093\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0017\u0010\u0095\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0095\u0001\u0010\u0094\u0001\u001a\u0017\u0010\u0096\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0096\u0001\u0010\u0094\u0001\u001a:\u0010\u009b\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010z2\u0007\u0010\u0097\u0001\u001a\u0002032\u000e\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0098\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a-\u0010 \u0001\u001a\u00020\u0004\"\u0005\b\u0000\u0010\u009d\u0001*\t\u0012\u0004\u0012\u00028\u00000\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u0017\u0010¢\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¢\u0001\u0010\u0094\u0001\u001a\u0017\u0010£\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b£\u0001\u0010\u0094\u0001\u001a0\u0010¨\u0001\u001a\u00030§\u0001*\b0¤\u0001j\u0003`¥\u00012\u0013\u0010¦\u0001\u001a\u000e\u0012\n\u0012\b0¤\u0001j\u0003`¥\u00010B¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001aC\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000B\"\u0004\b\u0000\u0010z*\t\u0012\u0004\u0012\u00028\u00000ª\u00012\u0014\u0010¬\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0«\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001\"\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001\"\u0017\u0010²\u0001\u001a\u00020D8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001\"\u0018\u0010µ\u0001\u001a\u00030´\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001\"\u0018\u0010¸\u0001\u001a\u00030·\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001\"\u0018\u0010»\u0001\u001a\u00030º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001\"\u0018\u0010¾\u0001\u001a\u00030½\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001\"\u0018\u0010Á\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001\"\u0017\u0010Ã\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001\"\u0017\u0010Å\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001\"\u0017\u0010Ç\u0001\u001a\u00020\u00078\u0006X\u0086T¢\u0006\b\n\u0006\bÇ\u0001\u0010Æ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006È\u0001"}, m6176d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "arrayLength", "offset", "count", HttpUrl.FRAGMENT_ENCODE_SET, "checkOffsetAndCount", "(JJJ)V", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", HttpUrl.FRAGMENT_ENCODE_SET, "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", FirebaseAnalytics.Param.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "delimiterOffset", "(Ljava/lang/String;Ljava/lang/String;II)I", HttpUrl.FRAGMENT_ENCODE_SET, "delimiter", "(Ljava/lang/String;CII)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "canParseAsIpAddress", "(Ljava/lang/String;)Z", "isSensitiveHeader", "format", HttpUrl.FRAGMENT_ENCODE_SET, "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "parseHexDigit", "(C)I", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", HttpUrl.FRAGMENT_ENCODE_SET, "mask", "and", "(BI)I", HttpUrl.FRAGMENT_ENCODE_SET, "(SI)I", "(IJ)J", "Lokio/BufferedSink;", FirebaseAnalytics.Param.MEDIUM, "writeMedium", "(Lokio/BufferedSink;I)V", "readMedium", "(Lokio/BufferedSource;)I", "Lokio/Source;", "timeUnit", "skipAll", "(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "discard", "Ljava/net/Socket;", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", FirebaseAnalytics.Param.SOURCE, "isHealthy", "(Ljava/net/Socket;Lokio/BufferedSource;)Z", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "(Lkotlin/jvm/functions/Function0;)V", "threadName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lokio/Buffer;", "b", "(Lokio/Buffer;B)I", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "defaultValue", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "T", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", HttpUrl.FRAGMENT_ENCODE_SET, "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "toHexString", "(J)Ljava/lang/String;", "(I)Ljava/lang/String;", "wait", "(Ljava/lang/Object;)V", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", HttpUrl.FRAGMENT_ENCODE_SET, "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", HttpUrl.FRAGMENT_ENCODE_SET, "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/Function1;", "predicate", "filterList", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", HttpUrl.FRAGMENT_ENCODE_SET, "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokio/Options;", "UNICODE_BOMS", "Lokio/Options;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, m6177k = 2, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */     public final class Util {
                public static final byte[] EMPTY_BYTE_ARRAY;
                public static final Headers EMPTY_HEADERS = Headers.INSTANCE.m7195of(new String[0]);
                public static final RequestBody EMPTY_REQUEST;
                public static final ResponseBody EMPTY_RESPONSE;
                private static final Options UNICODE_BOMS;
                public static final TimeZone UTC;
                private static final Regex VERIFY_AS_IP_ADDRESS;
                public static final boolean assertionsEnabled;
                public static final String okHttpName;
                public static final String userAgent = "okhttp/4.10.0";

                static {
/* 2 */             byte[] bArr = new byte[0];
/* 4 */             EMPTY_BYTE_ARRAY = bArr;
/* 24 */            EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, bArr, (MediaType) null, 1, (Object) null);
/* 36 */            EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, (MediaType) null, 0, 0, 7, (Object) null);
/* 38 */            Options.Companion companion = Options.INSTANCE;
/* 40 */            ByteString.Companion companion2 = ByteString.INSTANCE;
/* 80 */            UNICODE_BOMS = companion.m7205of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
/* 84 */            TimeZone timeZone = TimeZone.getTimeZone("GMT");
/* 88 */            timeZone.getClass();
/* 91 */            UTC = timeZone;
/* 100 */           VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
/* 102 */           assertionsEnabled = false;
/* 112 */           String strM6233I = StringsKt.m6233I(OkHttpClient.class.getName(), "okhttp3.");
/* 122 */           if (C1852e.m6257g(strM6233I, "Client", false)) {
/* 130 */               strM6233I = strM6233I.substring(0, strM6233I.length() - 6);
                    }
/* 134 */           okHttpName = strM6233I;
                }

                public static final <E> void addIfAbsent(List<E> list, E e) {
/* 1 */             list.getClass();
/* 8 */             if (list.contains(e)) {
/* 13 */                return;
                    }
/* 10 */            list.add(e);
                }

                public static final long and(int i, long j) {
/* 2 */             return ((long) i) & j;
                }

                public static final EventListener.Factory asFactory(EventListener eventListener) {
/* 1 */             eventListener.getClass();
/* 8 */             return new C2357x6(eventListener, 17);
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: asFactory$lambda-8, reason: not valid java name */
                public static final EventListener m10634asFactory$lambda8(EventListener eventListener, Call call) {
/* 1 */             eventListener.getClass();
/* 4 */             call.getClass();
/* 7 */             return eventListener;
                }

                public static final void assertThreadDoesntHoldLock(Object obj) {
/* 1 */             obj.getClass();
/* 6 */             if (assertionsEnabled && Thread.holdsLock(obj)) {
/* 25 */                s80.m8422c(Thread.currentThread().getName(), " MUST NOT hold lock on ", obj);
                    }
                }

                public static final void assertThreadHoldsLock(Object obj) {
/* 1 */             obj.getClass();
/* 6 */             if (!assertionsEnabled || Thread.holdsLock(obj)) {
/* 28 */                return;
                    }
/* 25 */            s80.m8422c(Thread.currentThread().getName(), " MUST hold lock on ", obj);
                }

                public static final boolean canParseAsIpAddress(String str) {
/* 1 */             str.getClass();
/* 6 */             return VERIFY_AS_IP_ADDRESS.m6223b(str);
                }

                public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
/* 1 */             httpUrl.getClass();
/* 4 */             httpUrl2.getClass();
                    return Intrinsics.m6216a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && Intrinsics.m6216a(httpUrl.scheme(), httpUrl2.scheme());
                }

                public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
/* 1 */             str.getClass();
/* 8 */             if (j < 0) {
/* 65 */                ds0.m3190g(Intrinsics.m6219d(" < 0", str));
/* 39 */                return 0;
                    }
/* 10 */            if (timeUnit == null) {
/* 55 */                f42.m3656l("unit == null");
/* 39 */                return 0;
                    }
/* 12 */            long millis = timeUnit.toMillis(j);
/* 21 */            if (millis > 2147483647L) {
/* 49 */                ds0.m3200q(Intrinsics.m6219d(" too large.", str));
/* 39 */                return 0;
                    }
/* 25 */            if (millis != 0 || j <= 0) {
/* 41 */                return (int) millis;
                    }
/* 36 */            ds0.m3200q(Intrinsics.m6219d(" too small.", str));
/* 39 */            return 0;
                }

                public static final void checkOffsetAndCount(long j, long j2, long j3) {
/* 7 */             if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
/* 24 */                throw new ArrayIndexOutOfBoundsException();
                    }
                }

                public static final void closeQuietly(Socket socket) {
/* 1 */             socket.getClass();
                    try {
/* 4 */                 socket.close();
                    } catch (AssertionError e) {
/* 24 */                throw e;
                    } catch (RuntimeException e2) {
/* 19 */                if (!Intrinsics.m6216a(e2.getMessage(), "bio == null")) {
/* 22 */                    throw e2;
                        }
                    } catch (Exception unused) {
                    }
                }

                public static final String[] concat(String[] strArr, String str) {
/* 1 */             strArr.getClass();
/* 4 */             str.getClass();
/* 14 */            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
/* 19 */            strArr2[strArr2.length - 1] = str;
/* 21 */            return strArr2;
                }

                public static final int delimiterOffset(String str, String str2, int i, int i2) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             while (i < i2) {
/* 9 */                 int i3 = i + 1;
/* 19 */                if (StringsKt.m6225A(str2, str.charAt(i))) {
/* 21 */                    return i;
                        }
/* 22 */                i = i3;
                    }
/* 24 */            return i2;
                }

                public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 2) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 4) != 0) {
/* 10 */                i2 = str.length();
                    }
/* 14 */            return delimiterOffset(str, str2, i, i2);
                }

                public static final boolean discard(Source source, int i, TimeUnit timeUnit) {
/* 1 */             source.getClass();
/* 4 */             timeUnit.getClass();
                    try {
/* 7 */                 return skipAll(source, i, timeUnit);
                    } catch (IOException unused) {
/* 12 */                return false;
                    }
                }

                public static final <T> List<T> filterList(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
/* 1 */             iterable.getClass();
/* 4 */             function1.getClass();
/* 7 */             ArrayList arrayList = nd0.f14189a;
/* 17 */            for (T t : iterable) {
/* 33 */                if (((Boolean) function1.invoke(t)).booleanValue()) {
/* 39 */                    if (arrayList.isEmpty()) {
/* 43 */                        arrayList = new ArrayList();
                            }
/* 50 */                    gs2.m4010a(arrayList).add(t);
                        }
                    }
                    return arrayList;
                }

                public static final String format(String str, Object... objArr) {
/* 1 */             str.getClass();
/* 4 */             objArr.getClass();
/* 7 */             Locale locale = Locale.US;
/* 10 */            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 19 */            return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                }

                public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
/* 1 */             strArr.getClass();
/* 4 */             comparator.getClass();
/* 9 */             if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
/* 18 */                int length = strArr.length;
/* 19 */                int i = 0;
/* 20 */                while (i < length) {
/* 22 */                    String str = strArr[i];
/* 24 */                    i++;
/* 28 */                    C2126r c2126r = new C2126r(strArr2);
/* 35 */                    while (c2126r.hasNext()) {
/* 47 */                        if (comparator.compare(str, (String) c2126r.next()) == 0) {
/* 49 */                            return true;
                                }
                            }
                        }
                    }
/* 8 */             return false;
                }

                public static final long headersContentLength(Response response) {
/* 1 */             response.getClass();
/* 10 */            String str = response.headers().get("Content-Length");
/* 16 */            if (str == null) {
/* 14 */                return -1L;
                    }
/* 19 */            return toLongOrDefault(str, -1L);
                }

                public static final void ignoreIoExceptions(Function0<Unit> function0) {
/* 1 */             function0.getClass();
                    try {
/* 4 */                 function0.invoke();
                    } catch (IOException unused) {
                    }
                }

                @SafeVarargs
                public static final <T> List<T> immutableListOf(T... tArr) {
/* 1 */             tArr.getClass();
/* 8 */             Object[] objArr = (Object[]) tArr.clone();
/* 19 */            List<T> listUnmodifiableList = Collections.unmodifiableList(C2085pw.m7566e(Arrays.copyOf(objArr, objArr.length)));
/* 23 */            listUnmodifiableList.getClass();
/* 26 */            return listUnmodifiableList;
                }

                public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
/* 1 */             strArr.getClass();
/* 4 */             str.getClass();
/* 7 */             comparator.getClass();
/* 10 */            int length = strArr.length;
/* 12 */            for (int i = 0; i < length; i++) {
/* 20 */                if (comparator.compare(strArr[i], str) == 0) {
/* 22 */                    return i;
                        }
                    }
/* 26 */            return -1;
                }

                public static final int indexOfControlOrNonAscii(String str) {
/* 1 */             str.getClass();
/* 4 */             int length = str.length();
/* 8 */             int i = 0;
/* 9 */             while (i < length) {
/* 11 */                int i2 = i + 1;
/* 13 */                char cCharAt = str.charAt(i);
/* 23 */                if (Intrinsics.m6217b(cCharAt, 31) <= 0 || Intrinsics.m6217b(cCharAt, 127) >= 0) {
/* 36 */                    return i;
                        }
/* 34 */                i = i2;
                    }
/* 37 */            return -1;
                }

                public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
/* 1 */             str.getClass();
/* 4 */             while (i < i2) {
/* 6 */                 int i3 = i + 1;
/* 8 */                 char cCharAt = str.charAt(i);
/* 14 */                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
/* 38 */                    return i;
                        }
/* 36 */                i = i3;
                    }
/* 39 */            return i2;
                }

                public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 2) != 0) {
/* 10 */                i2 = str.length();
                    }
/* 14 */            return indexOfFirstNonAsciiWhitespace(str, i, i2);
                }

                public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
/* 1 */             str.getClass();
/* 4 */             int i3 = i2 - 1;
/* 6 */             if (i <= i3) {
                        while (true) {
/* 8 */                     int i4 = i3 - 1;
/* 10 */                    char cCharAt = str.charAt(i3);
/* 16 */                    if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
/* 43 */                        return i3 + 1;
                            }
/* 38 */                    if (i3 != i) {
/* 41 */                        i3 = i4;
                            }
                        }
                    }
/* 46 */            return i;
                }

                public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 2) != 0) {
/* 10 */                i2 = str.length();
                    }
/* 14 */            return indexOfLastNonAsciiWhitespace(str, i, i2);
                }

                public static final int indexOfNonWhitespace(String str, int i) {
/* 1 */             str.getClass();
/* 4 */             int length = str.length();
/* 8 */             while (i < length) {
/* 10 */                int i2 = i + 1;
/* 12 */                char cCharAt = str.charAt(i);
/* 18 */                if (cCharAt != ' ' && cCharAt != '\t') {
/* 24 */                    return i;
                        }
/* 25 */                i = i2;
                    }
/* 27 */            return str.length();
                }

                public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 6 */             return indexOfNonWhitespace(str, i);
                }

                public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
/* 1 */             strArr.getClass();
/* 4 */             strArr2.getClass();
/* 7 */             comparator.getClass();
/* 12 */            ArrayList arrayList = new ArrayList();
/* 15 */            int length = strArr.length;
/* 17 */            int i = 0;
/* 18 */            while (i < length) {
/* 20 */                String str = strArr[i];
/* 22 */                i++;
/* 24 */                int length2 = strArr2.length;
/* 25 */                int i2 = 0;
/* 26 */                while (i2 < length2) {
/* 28 */                    String str2 = strArr2[i2];
/* 30 */                    i2++;
/* 36 */                    if (comparator.compare(str, str2) == 0) {
/* 38 */                        arrayList.add(str);
                                break;
                            }
                        }
                    }
/* 44 */            Object[] array = arrayList.toArray(new String[0]);
/* 48 */            if (array != null) {
/* 50 */                return (String[]) array;
                    }
/* 55 */            C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
/* 58 */            return null;
                }

                public static final boolean isCivilized(FileSystem fileSystem, File file) throws IOException {
/* 1 */             fileSystem.getClass();
/* 4 */             file.getClass();
/* 7 */             Sink sink = fileSystem.sink(file);
                    try {
/* 12 */                fileSystem.delete(file);
/* 15 */                jb1.m5754n(sink, null);
/* 18 */                return true;
                    } catch (IOException unused) {
/* 27 */                jb1.m5754n(sink, null);
/* 30 */                fileSystem.delete(file);
/* 33 */                return false;
                    } catch (Throwable th) {
                        try {
/* 21 */                    throw th;
                        } catch (Throwable th2) {
/* 23 */                    jb1.m5754n(sink, th);
/* 26 */                    throw th2;
                        }
                    }
                }

                public static final boolean isHealthy(Socket socket, BufferedSource bufferedSource) {
/* 1 */             socket.getClass();
/* 4 */             bufferedSource.getClass();
                    try {
/* 8 */                 int soTimeout = socket.getSoTimeout();
                        try {
/* 12 */                    socket.setSoTimeout(1);
/* 19 */                    return !bufferedSource.exhausted();
                        } finally {
/* 25 */                    socket.setSoTimeout(soTimeout);
                        }
                    } catch (SocketTimeoutException unused) {
/* 7 */                 return true;
                    } catch (IOException unused2) {
/* 29 */                return false;
                    }
                }

                public static final boolean isSensitiveHeader(String str) {
/* 1 */             str.getClass();
                    return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
                }

                public static final void notify(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             obj.notify();
                }

                public static final void notifyAll(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             obj.notifyAll();
                }

                public static final int parseHexDigit(char c) {
/* 3 */             if ('0' <= c && c < ':') {
/* 9 */                 return c - '0';
                    }
/* 13 */            if ('a' <= c && c < 'g') {
/* 19 */                return c - 'W';
                    }
/* 24 */            if ('A' > c || c >= 'G') {
/* 33 */                return -1;
                    }
/* 30 */            return c - '7';
                }

                public static final String peerName(Socket socket) {
/* 1 */             socket.getClass();
/* 4 */             SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
/* 10 */            if (!(remoteSocketAddress instanceof InetSocketAddress)) {
/* 22 */                return remoteSocketAddress.toString();
                    }
/* 14 */            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
/* 18 */            hostName.getClass();
/* 21 */            return hostName;
                }

                public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) throws IOException {
/* 1 */             bufferedSource.getClass();
/* 4 */             charset.getClass();
/* 9 */             int iSelect = bufferedSource.select(UNICODE_BOMS);
/* 14 */            if (iSelect == -1) {
/* 96 */                return charset;
                    }
/* 16 */            if (iSelect == 0) {
/* 90 */                Charset charset2 = StandardCharsets.UTF_8;
/* 92 */                charset2.getClass();
/* 95 */                return charset2;
                    }
/* 19 */            if (iSelect == 1) {
/* 84 */                Charset charset3 = StandardCharsets.UTF_16BE;
/* 86 */                charset3.getClass();
/* 89 */                return charset3;
                    }
/* 22 */            if (iSelect == 2) {
/* 78 */                Charset charset4 = StandardCharsets.UTF_16LE;
/* 80 */                charset4.getClass();
/* 83 */                return charset4;
                    }
/* 25 */            if (iSelect == 3) {
/* 59 */                Charsets.f12932a.getClass();
/* 62 */                Charset charset5 = Charsets.f12934c;
/* 64 */                if (charset5 != null) {
/* 77 */                    return charset5;
                        }
/* 68 */                Charset charsetForName = Charset.forName("UTF-32BE");
/* 72 */                charsetForName.getClass();
/* 75 */                Charsets.f12934c = charsetForName;
/* 77 */                return charsetForName;
                    }
/* 28 */            if (iSelect != 4) {
/* 56 */                throw new AssertionError();
                    }
/* 32 */            Charsets.f12932a.getClass();
/* 35 */            Charset charset6 = Charsets.f12933b;
/* 37 */            if (charset6 != null) {
/* 50 */                return charset6;
                    }
/* 41 */            Charset charsetForName2 = Charset.forName("UTF-32LE");
/* 45 */            charsetForName2.getClass();
/* 48 */            Charsets.f12933b = charsetForName2;
/* 50 */            return charsetForName2;
                }

                public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) throws IllegalAccessException {
                    Object fieldOrNull;
/* 1 */             obj.getClass();
/* 4 */             cls.getClass();
/* 7 */             str.getClass();
/* 10 */            Class<?> superclass = obj.getClass();
                    while (true) {
/* 20 */                T tCast = null;
/* 21 */                if (Intrinsics.m6216a(superclass, Object.class)) {
/* 61 */                    if (Intrinsics.m6216a(str, "delegate") || (fieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
/* 20 */                        return null;
                            }
/* 69 */                    return (T) readFieldOrNull(fieldOrNull, cls, str);
                        }
                        try {
/* 23 */                    Field declaredField = superclass.getDeclaredField(str);
/* 28 */                    declaredField.setAccessible(true);
/* 31 */                    Object obj2 = declaredField.get(obj);
/* 39 */                    if (cls.isInstance(obj2)) {
/* 42 */                        tCast = cls.cast(obj2);
                            }
/* 46 */                    return tCast;
                        } catch (NoSuchFieldException unused) {
/* 47 */                    superclass = superclass.getSuperclass();
/* 51 */                    superclass.getClass();
                        }
                    }
                }

                public static final int readMedium(BufferedSource bufferedSource) throws IOException {
/* 1 */             bufferedSource.getClass();
/* 35 */            return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
                }

                public static final boolean skipAll(Source source, int i, TimeUnit timeUnit) throws IOException {
/* 1 */             source.getClass();
/* 4 */             timeUnit.getClass();
/* 7 */             long jNanoTime = System.nanoTime();
/* 36 */            long jDeadlineNanoTime = source.getTimeout().getHasDeadline() ? source.getTimeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
/* 51 */            source.getTimeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
                    try {
/* 56 */                Buffer buffer = new Buffer();
/* 69 */                while (source.read(buffer, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
/* 71 */                    buffer.clear();
                        }
/* 80 */                if (jDeadlineNanoTime == Long.MAX_VALUE) {
/* 86 */                    source.getTimeout().clearDeadline();
/* 79 */                    return true;
                        }
/* 95 */                source.getTimeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
/* 79 */                return true;
                    } catch (InterruptedIOException unused) {
/* 122 */               if (jDeadlineNanoTime == Long.MAX_VALUE) {
/* 128 */                   source.getTimeout().clearDeadline();
/* 140 */                   return false;
                        }
/* 137 */               source.getTimeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
/* 140 */               return false;
                    } catch (Throwable th) {
/* 101 */               if (jDeadlineNanoTime == Long.MAX_VALUE) {
/* 107 */                   source.getTimeout().clearDeadline();
                        } else {
/* 116 */                   source.getTimeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
                        }
/* 119 */               throw th;
                    }
                }

                public static final ThreadFactory threadFactory(final String str, final boolean z) {
/* 1 */             str.getClass();
/* 6 */             return new ThreadFactory() { // from class: o13
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
/* 1 */                     return Util.m10635threadFactory$lambda1(str, z, runnable);
                        }
                    };
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: threadFactory$lambda-1, reason: not valid java name */
                public static final Thread m10635threadFactory$lambda1(String str, boolean z, Runnable runnable) {
/* 1 */             str.getClass();
/* 6 */             Thread thread = new Thread(runnable, str);
/* 9 */             thread.setDaemon(z);
/* 12 */            return thread;
                }

                public static final void threadName(String str, Function0<Unit> function0) {
/* 1 */             str.getClass();
/* 4 */             function0.getClass();
/* 7 */             Thread threadCurrentThread = Thread.currentThread();
/* 11 */            String name = threadCurrentThread.getName();
/* 15 */            threadCurrentThread.setName(str);
                    try {
/* 18 */                function0.invoke();
                    } finally {
/* 26 */                threadCurrentThread.setName(name);
                    }
                }

                public static final List<Header> toHeaderList(Headers headers) {
/* 1 */             headers.getClass();
/* 9 */             IntRange intRangeM8048e = r02.m8048e(0, headers.size());
/* 21 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(intRangeM8048e, 10));
/* 24 */            Iterator it = intRangeM8048e.iterator();
/* 32 */            while (it.hasNext()) {
/* 37 */                int iNextInt = ((wy0) it).nextInt();
/* 54 */                arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
                    }
/* 58 */            return arrayList;
                }

                public static final Headers toHeaders(List<Header> list) {
/* 1 */             list.getClass();
/* 6 */             Headers.Builder builder = new Headers.Builder();
/* 17 */            for (Header header : list) {
/* 41 */                builder.addLenient$okhttp(header.getName().utf8(), header.getValue().utf8());
                    }
/* 45 */            return builder.build();
                }

                public static final String toHexString(long j) {
/* 1 */             String hexString = Long.toHexString(j);
/* 5 */             hexString.getClass();
/* 8 */             return hexString;
                }

                public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
                    String strHost;
/* 1 */             httpUrl.getClass();
/* 15 */            if (StringsKt.m6240z(httpUrl.host(), ":", false)) {
/* 36 */                strHost = "[" + httpUrl.host() + ']';
                    } else {
/* 41 */                strHost = httpUrl.host();
                    }
/* 45 */            if (!z && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
/* 64 */                return strHost;
                    }
/* 85 */            return strHost + ':' + httpUrl.port();
                }

                public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 z = false;
                    }
/* 6 */             return toHostHeader(httpUrl, z);
                }

                public static final <T> List<T> toImmutableList(List<? extends T> list) {
/* 1 */             list.getClass();
/* 9 */             List<T> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
/* 13 */            listUnmodifiableList.getClass();
/* 16 */            return listUnmodifiableList;
                }

                public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
/* 1 */             map.getClass();
/* 8 */             if (map.isEmpty()) {
/* 10 */                od0 od0Var = od0.f14715a;
/* 12 */                od0Var.getClass();
/* 15 */                return od0Var;
                    }
/* 21 */            Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
/* 25 */            mapUnmodifiableMap.getClass();
/* 28 */            return mapUnmodifiableMap;
                }

                public static final long toLongOrDefault(String str, long j) {
/* 1 */             str.getClass();
                    try {
/* 4 */                 return Long.parseLong(str);
                    } catch (NumberFormatException unused) {
/* 9 */                 return j;
                    }
                }

                public static final int toNonNegativeInt(String str, int i) {
                    Long lValueOf;
/* 1 */             if (str == null) {
/* 3 */                 lValueOf = null;
                    } else {
                        try {
/* 9 */                     lValueOf = Long.valueOf(Long.parseLong(str));
                        } catch (NumberFormatException unused) {
                        }
                    }
/* 13 */            if (lValueOf == null) {
/* 41 */                return i;
                    }
/* 16 */            long jLongValue = lValueOf.longValue();
/* 25 */            if (jLongValue > 2147483647L) {
/* 27 */                return AbstractC0208c9.API_PRIORITY_OTHER;
                    }
/* 35 */            if (jLongValue < 0) {
/* 37 */                return 0;
                    }
/* 39 */            return (int) jLongValue;
                }

                public static final String trimSubstring(String str, int i, int i2) {
/* 1 */             str.getClass();
/* 4 */             int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
/* 12 */            return str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i2));
                }

                public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 2) != 0) {
/* 10 */                i2 = str.length();
                    }
/* 14 */            return trimSubstring(str, i, i2);
                }

                public static final void wait(Object obj) throws InterruptedException {
/* 1 */             obj.getClass();
/* 4 */             obj.wait();
                }

                public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
/* 1 */             exc.getClass();
/* 4 */             list.getClass();
/* 12 */            if (list.size() > 1) {
/* 16 */                System.out.println(list);
                    }
/* 19 */            Iterator<? extends Exception> it = list.iterator();
/* 27 */            while (it.hasNext()) {
/* 35 */                jf0.m5798a(exc, it.next());
                    }
/* 39 */            return exc;
                }

                public static final void writeMedium(BufferedSink bufferedSink, int i) throws IOException {
/* 1 */             bufferedSink.getClass();
/* 8 */             bufferedSink.writeByte((i >>> 16) & 255);
/* 15 */            bufferedSink.writeByte((i >>> 8) & 255);
/* 20 */            bufferedSink.writeByte(i & 255);
                }

/* 4 */         public static final int and(short s, int i) {
/* 5 */             return s & i;
                }

/* 5 */         public static final int and(byte b, int i) {
/* 6 */             return b & i;
                }

/* 8 */         public static final String toHexString(int i) {
/* 9 */             String hexString = Integer.toHexString(i);
                    hexString.getClass();
                    return hexString;
                }

/* 18 */        public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
                    if ((i3 & 2) != 0) {
                        i = 0;
                    }
                    if ((i3 & 4) != 0) {
/* 19 */                i2 = str.length();
                    }
                    return delimiterOffset(str, c, i, i2);
                }

/* 24 */        public static final void closeQuietly(Closeable closeable) {
                    closeable.getClass();
                    try {
/* 25 */                closeable.close();
                    } catch (RuntimeException e) {
/* 26 */                throw e;
                    } catch (Exception unused) {
                    }
                }

/* 24 */        public static final int delimiterOffset(String str, char c, int i, int i2) {
                    str.getClass();
                    while (i < i2) {
                        int i3 = i + 1;
/* 25 */                if (str.charAt(i) == c) {
                            return i;
                        }
                        i = i3;
                    }
                    return i2;
                }

/* 26 */        public static final void closeQuietly(ServerSocket serverSocket) {
                    serverSocket.getClass();
                    try {
/* 27 */                serverSocket.close();
                    } catch (RuntimeException e) {
/* 28 */                throw e;
                    } catch (Exception unused) {
                    }
                }

/* 141 */       public static final int skipAll(Buffer buffer, byte b) throws EOFException {
                    buffer.getClass();
                    int i = 0;
/* 142 */           while (!buffer.exhausted() && buffer.getByte(0L) == b) {
                        i++;
/* 143 */               buffer.readByte();
                    }
                    return i;
                }
            }
