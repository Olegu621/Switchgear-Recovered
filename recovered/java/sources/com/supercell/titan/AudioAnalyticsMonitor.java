            package com.supercell.titan;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.media.AudioDeviceInfo;
            import android.media.AudioManager;
            import android.os.Build;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.C2103qd;
            import p000.C2122qw;
            import p000.oc1;
            import p000.ra2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m6176d2 = {"Lcom/supercell/titan/AudioAnalyticsMonitor;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/content/Context;", "ctx", HttpUrl.FRAGMENT_ENCODE_SET, "nativeHandle", "<init>", "(Landroid/content/Context;J)V", HttpUrl.FRAGMENT_ENCODE_SET, "start", "()V", "stop", "Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;", "getOnce", "()Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;", "Companion", "Snapshot", "ra2", "titan"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final class AudioAnalyticsMonitor {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);

                /* JADX INFO: renamed from: g */
                public static final Map f5715g = oc1.m7131e(new Pair(3, 0), new Pair(4, 0), new Pair(2, 1), new Pair(5, 2), new Pair(6, 2), new Pair(1, 3));

                /* JADX INFO: renamed from: a */
                public final long f5716a;

                /* JADX INFO: renamed from: b */
                public final Context f5717b;

                /* JADX INFO: renamed from: c */
                public final AudioManager f5718c;

                /* JADX INFO: renamed from: d */
                public C07871 f5719d;

                /* JADX INFO: renamed from: e */
                public boolean f5720e;

                /* JADX INFO: renamed from: f */
                public boolean f5721f;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001Jv\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, m6176d2 = {"Lcom/supercell/titan/AudioAnalyticsMonitor$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "nativeHandle", HttpUrl.FRAGMENT_ENCODE_SET, "volume", HttpUrl.FRAGMENT_ENCODE_SET, "muted", "muteKnown", HttpUrl.FRAGMENT_ENCODE_SET, "outputRoutes", HttpUrl.FRAGMENT_ENCODE_SET, "eventType", "routeChangeReason", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "outputDeviceNames", "outputChannelCounts", "sampleRate", "bufferSize", "otherMediaIsPlaying", HttpUrl.FRAGMENT_ENCODE_SET, "updateAudioState", "(JFZZ[IIILkotlin/Array;[IIIZ)V", "EVENT_ROUTE_CHANGE", "I", "EVENT_HARDWARE_VOLUME_CHANGE", "EVENT_HARDWARE_MUTE_CHANGE", "EVENT_MANUAL_SNAPSHOT", "ROUTE_UNKNOWN", "ROUTE_BUILT_IN_SPEAKER", "ROUTE_HEADPHONES", "ROUTE_BLUETOOTH_A2DP", "ROUTE_BLUETOOTH_SCO", "ROUTE_HDMI", "ROUTE_USB", HttpUrl.FRAGMENT_ENCODE_SET, "ROUTE_SAMPLE_RATE_PRIORITY", "Ljava/util/Map;", "ACTION_VOLUME_CHANGED", "Ljava/lang/String;", "EXTRA_VOLUME_STREAM_TYPE", "titan"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
                public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public static final void access$updateAudioState(Companion companion, long j, float f, boolean z, boolean z2, int[] iArr, int i, int i2, String[] strArr, int[] iArr2, int i3, int i4, boolean z3) {
/* 1 */                 companion.getClass();
/* 1 */                 AudioAnalyticsMonitor.updateAudioState(j, f, z, z2, iArr, i, i2, strArr, iArr2, i3, i4, z3);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m6176d2 = {"Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;", HttpUrl.FRAGMENT_ENCODE_SET, "volume", HttpUrl.FRAGMENT_ENCODE_SET, "muted", HttpUrl.FRAGMENT_ENCODE_SET, "muteKnown", "outputRoutes", HttpUrl.FRAGMENT_ENCODE_SET, "outputDeviceNames", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "outputChannelCounts", "sampleRate", HttpUrl.FRAGMENT_ENCODE_SET, "bufferSize", "otherMediaIsPlaying", "<init>", "(FZZ[I[Ljava/lang/String;[IIIZ)V", "[Ljava/lang/String;", "titan"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
                public static final class Snapshot {
                    public final int bufferSize;
                    public final boolean muteKnown;
                    public final boolean muted;
                    public final boolean otherMediaIsPlaying;
                    public final int[] outputChannelCounts;
                    public final String[] outputDeviceNames;
                    public final int[] outputRoutes;
                    public final int sampleRate;
                    public final float volume;

                    public Snapshot(float f, boolean z, boolean z2, int[] iArr, String[] strArr, int[] iArr2, int i, int i2, boolean z3) {
/* 1 */                 iArr.getClass();
/* 4 */                 strArr.getClass();
/* 7 */                 iArr2.getClass();
/* 13 */                this.volume = f;
/* 15 */                this.muted = z;
/* 17 */                this.muteKnown = z2;
/* 19 */                this.outputRoutes = iArr;
/* 21 */                this.outputDeviceNames = strArr;
/* 23 */                this.outputChannelCounts = iArr2;
/* 25 */                this.sampleRate = i;
/* 27 */                this.bufferSize = i2;
/* 29 */                this.otherMediaIsPlaying = z3;
                    }
                }

                public AudioAnalyticsMonitor(Context context, long j) {
/* 1 */             context.getClass();
/* 7 */             this.f5716a = j;
/* 9 */             Context applicationContext = context.getApplicationContext();
/* 13 */            applicationContext.getClass();
/* 16 */            this.f5717b = applicationContext;
/* 20 */            Object systemService = applicationContext.getSystemService("audio");
/* 24 */            systemService.getClass();
/* 29 */            this.f5718c = (AudioManager) systemService;
                }

                /* JADX INFO: renamed from: a */
                public static final Integer m2721a(AudioDeviceInfo audioDeviceInfo) {
/* 1 */             int type = audioDeviceInfo.getType();
/* 6 */             if (type == 2) {
/* 51 */                return 1;
                    }
/* 9 */             if (type == 3 || type == 4) {
/* 45 */                return 2;
                    }
/* 16 */            if (type != 22) {
                        switch (type) {
                            case 7:
/* 34 */                        return 4;
                            case 8:
/* 29 */                        return 3;
                            case 9:
                            case 10:
/* 24 */                        return 5;
                            case 11:
                                break;
                            default:
/* 21 */                        return null;
                        }
                    }
/* 40 */            return 6;
                }

                public static final void access$notifyNative(AudioAnalyticsMonitor audioAnalyticsMonitor, Snapshot snapshot, int i) {
/* 26 */            Companion.access$updateAudioState(INSTANCE, audioAnalyticsMonitor.f5716a, snapshot.volume, snapshot.muted, snapshot.muteKnown, snapshot.outputRoutes, i, -1, snapshot.outputDeviceNames, snapshot.outputChannelCounts, snapshot.sampleRate, snapshot.bufferSize, snapshot.otherMediaIsPlaying);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final native void updateAudioState(long j, float f, boolean z, boolean z2, int[] iArr, int i, int i2, String[] strArr, int[] iArr2, int i3, int i4, boolean z3);

                /* JADX INFO: renamed from: b */
                public final Snapshot m2722b() {
                    ra2 ra2Var;
                    Object next;
                    int i;
                    int iIntValue;
                    String property;
                    Integer intOrNull;
                    String string;
/* 1 */             AudioManager audioManager = this.f5718c;
/* 4 */             int streamMaxVolume = audioManager.getStreamMaxVolume(3);
/* 19 */            float streamVolume = streamMaxVolume > 0 ? audioManager.getStreamVolume(3) / streamMaxVolume : 0.0f;
/* 21 */            boolean zIsStreamMute = audioManager.isStreamMute(3);
/* 25 */            int iIntValue2 = -1;
/* 31 */            AudioDeviceInfo[] devices = audioManager.getDevices(2);
/* 35 */            devices.getClass();
/* 40 */            ArrayList<AudioDeviceInfo> arrayList = new ArrayList();
/* 46 */            for (AudioDeviceInfo audioDeviceInfo : devices) {
/* 50 */                audioDeviceInfo.getClass();
/* 57 */                if (m2721a(audioDeviceInfo) != null) {
/* 59 */                    arrayList.add(audioDeviceInfo);
                        }
                    }
/* 71 */            if (arrayList.isEmpty()) {
/* 288 */               ra2Var = new ra2(C1839a.m6210b(0), C1839a.m6210b(HttpUrl.FRAGMENT_ENCODE_SET), C1839a.m6210b(-1), C1839a.m6210b(-1));
                    } else {
/* 81 */                ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 92 */                for (AudioDeviceInfo audioDeviceInfo2 : arrayList) {
/* 100 */                   audioDeviceInfo2.getClass();
/* 103 */                   Integer numM2721a = m2721a(audioDeviceInfo2);
/* 107 */                   numM2721a.getClass();
/* 110 */                   arrayList2.add(numM2721a);
                        }
/* 120 */               ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 123 */               Iterator it = arrayList.iterator();
/* 131 */               while (it.hasNext()) {
/* 139 */                   CharSequence productName = ((AudioDeviceInfo) it.next()).getProductName();
/* 143 */                   if (productName == null || (string = productName.toString()) == null) {
/* 151 */                       string = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
/* 152 */                   arrayList3.add(string);
                        }
/* 162 */               ArrayList arrayList4 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 165 */               Iterator it2 = arrayList.iterator();
/* 173 */               while (it2.hasNext()) {
/* 181 */                   int[] channelCounts = ((AudioDeviceInfo) it2.next()).getChannelCounts();
/* 185 */                   channelCounts.getClass();
/* 188 */                   Integer numM7776k = C2103qd.m7776k(channelCounts);
/* 204 */                   arrayList4.add(Integer.valueOf(numM7776k != null ? numM7776k.intValue() : -1));
                        }
/* 214 */               ArrayList arrayList5 = new ArrayList(C2122qw.m8020h(arrayList, 10));
/* 217 */               Iterator it3 = arrayList.iterator();
/* 225 */               while (it3.hasNext()) {
/* 233 */                   int[] sampleRates = ((AudioDeviceInfo) it3.next()).getSampleRates();
/* 237 */                   sampleRates.getClass();
/* 240 */                   Integer numM7776k2 = C2103qd.m7776k(sampleRates);
/* 256 */                   arrayList5.add(Integer.valueOf(numM7776k2 != null ? numM7776k2.intValue() : -1));
                        }
/* 262 */               ra2Var = new ra2((List) arrayList2, (List) arrayList3, (List) arrayList4, (List) arrayList5);
                    }
/* 293 */           List list = (List) ra2Var.f15955a;
/* 299 */           ArrayList arrayListM6196O = CollectionsKt.m6196O(list, (List) ra2Var.f15958d);
/* 305 */           ArrayList arrayList6 = new ArrayList();
/* 316 */           for (Object obj : arrayListM6196O) {
/* 333 */               if (((Number) ((Pair) obj).f12909b).intValue() > 0) {
/* 335 */                   arrayList6.add(obj);
                        }
                    }
/* 339 */           Iterator it4 = arrayList6.iterator();
/* 348 */           if (it4.hasNext()) {
/* 352 */               next = it4.next();
/* 360 */               if (it4.hasNext()) {
/* 374 */                   Integer numValueOf = Integer.valueOf(((Number) ((Pair) next).f12908a).intValue());
/* 378 */                   Map map = f5715g;
/* 384 */                   Integer num = (Integer) map.get(numValueOf);
/* 396 */                   int iIntValue3 = num != null ? num.intValue() : Integer.MAX_VALUE;
/* 438 */                   do {
/* 397 */                       Object next2 = it4.next();
/* 420 */                       Integer num2 = (Integer) map.get(Integer.valueOf(((Number) ((Pair) next2).f12908a).intValue()));
/* 429 */                       int iIntValue4 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
/* 430 */                       if (iIntValue3 > iIntValue4) {
/* 432 */                           next = next2;
/* 433 */                           iIntValue3 = iIntValue4;
                                }
/* 438 */                   } while (it4.hasNext());
                        }
                    } else {
/* 350 */               next = null;
                    }
/* 440 */           Pair pair = (Pair) next;
/* 442 */           if (pair == null) {
/* 456 */               String property2 = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
/* 462 */               Integer intOrNull2 = property2 != null ? StringsKt.toIntOrNull(property2) : null;
/* 466 */               if (intOrNull2 != null) {
/* 468 */                   iIntValue = intOrNull2.intValue();
                        } else {
/* 473 */                   i = -1;
                        }
/* 476 */               property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
/* 480 */               if (property != null && (intOrNull = StringsKt.toIntOrNull(property)) != null) {
/* 488 */                   iIntValue2 = intOrNull.intValue();
                        }
/* 526 */               return new Snapshot(streamVolume, zIsStreamMute, true, CollectionsKt.m6191J(list), (String[]) ((List) ra2Var.f15956b).toArray(new String[0]), CollectionsKt.m6191J((List) ra2Var.f15957c), i, iIntValue2, audioManager.isMusicActive());
                    }
/* 448 */           iIntValue = ((Number) pair.f12909b).intValue();
/* 452 */           i = iIntValue;
/* 476 */           property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
/* 480 */           if (property != null) {
/* 488 */               iIntValue2 = intOrNull.intValue();
                    }
/* 526 */           return new Snapshot(streamVolume, zIsStreamMute, true, CollectionsKt.m6191J(list), (String[]) ((List) ra2Var.f15956b).toArray(new String[0]), CollectionsKt.m6191J((List) ra2Var.f15957c), i, iIntValue2, audioManager.isMusicActive());
                }

                public final Snapshot getOnce() {
/* 1 */             return m2722b();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v7, types: [android.content.BroadcastReceiver, com.supercell.titan.AudioAnalyticsMonitor$start$1] */
                public final void start() {
/* 3 */             if (this.f5720e) {
/* 5 */                 return;
                    }
/* 7 */             this.f5720e = true;
/* 9 */             Snapshot snapshotM2722b = m2722b();
/* 13 */            boolean z = snapshotM2722b.muted;
/* 15 */            this.f5721f = z;
/* 40 */            Companion.access$updateAudioState(INSTANCE, this.f5716a, snapshotM2722b.volume, z, snapshotM2722b.muteKnown, snapshotM2722b.outputRoutes, 8, -1, snapshotM2722b.outputDeviceNames, snapshotM2722b.outputChannelCounts, snapshotM2722b.sampleRate, snapshotM2722b.bufferSize, snapshotM2722b.otherMediaIsPlaying);
/* 45 */            IntentFilter intentFilter = new IntentFilter();
/* 50 */            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
/* 55 */            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
/* 60 */            intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
/* 65 */            ?? r1 = new BroadcastReceiver() { // from class: com.supercell.titan.AudioAnalyticsMonitor.start.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
/* 1 */                     context.getClass();
/* 4 */                     intent.getClass();
/* 7 */                     String action = intent.getAction();
/* 11 */                    if (action != null) {
/* 13 */                        int iHashCode = action.hashCode();
/* 20 */                        AudioAnalyticsMonitor audioAnalyticsMonitor = AudioAnalyticsMonitor.this;
/* 22 */                        if (iHashCode != -1940635523) {
/* 27 */                            if (iHashCode != -1676458352) {
/* 32 */                                if (iHashCode != -549244379 || !action.equals("android.media.AUDIO_BECOMING_NOISY")) {
/* 110 */                                   return;
                                        }
                                    } else if (!action.equals("android.intent.action.HEADSET_PLUG")) {
/* 110 */                               return;
                                    }
/* 58 */                            AudioAnalyticsMonitor.access$notifyNative(audioAnalyticsMonitor, audioAnalyticsMonitor.m2722b(), 0);
/* 61 */                            return;
                                }
/* 68 */                        if (action.equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
/* 1 */                             Snapshot snapshotM2722b2 = audioAnalyticsMonitor.m2722b();
/* 86 */                            if (!snapshotM2722b2.muteKnown || snapshotM2722b2.muted == audioAnalyticsMonitor.f5721f) {
/* 107 */                               AudioAnalyticsMonitor.access$notifyNative(audioAnalyticsMonitor, snapshotM2722b2, 1);
                                    } else {
/* 1 */                                 audioAnalyticsMonitor.f5721f = snapshotM2722b2.muted;
/* 102 */                               AudioAnalyticsMonitor.access$notifyNative(audioAnalyticsMonitor, snapshotM2722b2, 2);
                                    }
                                }
                            }
                        }
                    };
/* 68 */            this.f5719d = r1;
/* 70 */            int i = Build.VERSION.SDK_INT;
/* 74 */            Context context = this.f5717b;
/* 76 */            if (i >= 33) {
/* 2 */                 context.registerReceiver(r1, intentFilter, 4);
                    } else {
/* 82 */                context.registerReceiver(r1, intentFilter);
                    }
                }

                public final void stop() {
/* 3 */             if (this.f5720e) {
/* 7 */                 this.f5720e = false;
/* 9 */                 C07871 c07871 = this.f5719d;
/* 11 */                if (c07871 != null) {
/* 15 */                    this.f5717b.unregisterReceiver(c07871);
/* 19 */                    this.f5719d = null;
                        }
                    }
                }
            }
