            package okio;

            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0007J\b\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0015"}, m6176d2 = {"Lokio/SegmentPool;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "HASH_BUCKET_COUNT", HttpUrl.FRAGMENT_ENCODE_SET, "LOCK", "Lokio/Segment;", "MAX_SIZE", "getMAX_SIZE", "()I", "byteCount", "getByteCount", "hashBuckets", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/concurrent/atomic/AtomicReference;", "[Ljava/util/concurrent/atomic/AtomicReference;", "firstRef", "recycle", HttpUrl.FRAGMENT_ENCODE_SET, "segment", "take", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class SegmentPool {
                private static final int HASH_BUCKET_COUNT;
                private static final AtomicReference<Segment>[] hashBuckets;
                public static final SegmentPool INSTANCE = new SegmentPool();
                private static final int MAX_SIZE = 65536;
                private static final Segment LOCK = new Segment(new byte[0], 0, 0, false, false);

                static {
/* 38 */            int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
/* 42 */            HASH_BUCKET_COUNT = iHighestOneBit;
/* 44 */            AtomicReference<Segment>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
/* 46 */            for (int i = 0; i < iHighestOneBit; i++) {
/* 53 */                atomicReferenceArr[i] = new AtomicReference<>();
                    }
/* 58 */            hashBuckets = atomicReferenceArr;
                }

                private SegmentPool() {
                }

                private final AtomicReference<Segment> firstRef() {
/* 19 */            return hashBuckets[(int) (Thread.currentThread().getId() & (((long) HASH_BUCKET_COUNT) - 1))];
                }

                public static final void recycle(Segment segment) {
                    AtomicReference<Segment> atomicReferenceFirstRef;
                    Segment segment2;
                    Segment andSet;
/* 1 */             segment.getClass();
/* 6 */             if (segment.next != null || segment.prev != null) {
/* 63 */                C1951n4.m6859j("Failed requirement.");
/* 66 */                return;
                    }
/* 14 */            if (segment.shared || (andSet = (atomicReferenceFirstRef = INSTANCE.firstRef()).getAndSet((segment2 = LOCK))) == segment2) {
/* 33 */                return;
                    }
/* 40 */            int i = andSet != null ? andSet.limit : 0;
/* 43 */            if (i >= MAX_SIZE) {
/* 45 */                atomicReferenceFirstRef.set(andSet);
/* 48 */                return;
                    }
/* 49 */            segment.next = andSet;
/* 51 */            segment.pos = 0;
/* 55 */            segment.limit = i + Segment.SIZE;
/* 57 */            atomicReferenceFirstRef.set(segment);
                }

                public static final Segment take() {
/* 3 */             AtomicReference<Segment> atomicReferenceFirstRef = INSTANCE.firstRef();
/* 7 */             Segment segment = LOCK;
/* 9 */             Segment andSet = atomicReferenceFirstRef.getAndSet(segment);
/* 15 */            if (andSet == segment) {
/* 19 */                return new Segment();
                    }
/* 24 */            if (andSet == null) {
/* 26 */                atomicReferenceFirstRef.set(null);
/* 31 */                return new Segment();
                    }
/* 37 */            atomicReferenceFirstRef.set(andSet.next);
/* 40 */            andSet.next = null;
/* 43 */            andSet.limit = 0;
/* 45 */            return andSet;
                }

                public final int getByteCount() {
/* 5 */             Segment segment = firstRef().get();
/* 11 */            if (segment == null) {
/* 13 */                return 0;
                    }
/* 15 */            return segment.limit;
                }

                public final int getMAX_SIZE() {
/* 1 */             return MAX_SIZE;
                }
            }
