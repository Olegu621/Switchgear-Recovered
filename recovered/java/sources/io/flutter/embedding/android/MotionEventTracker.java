            package io.flutter.embedding.android;

            import android.util.LongSparseArray;
            import android.view.MotionEvent;
            import java.util.PriorityQueue;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class MotionEventTracker {
                private static MotionEventTracker INSTANCE = null;
                private static final String TAG = "MotionEventTracker";
                private final LongSparseArray<MotionEvent> eventById = new LongSparseArray<>();
                private final PriorityQueue<Long> unusedEvents = new PriorityQueue<>();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class MotionEventId {
                    private static final AtomicLong ID_COUNTER = new AtomicLong(0);

                    /* JADX INFO: renamed from: id */
                    private final long f9737id;

                    private MotionEventId(long j) {
/* 4 */                 this.f9737id = j;
                    }

                    public static MotionEventId createUnique() {
/* 7 */                 return from(ID_COUNTER.incrementAndGet());
                    }

                    public static MotionEventId from(long j) {
/* 3 */                 return new MotionEventId(j);
                    }

                    public long getId() {
/* 1 */                 return this.f9737id;
                    }
                }

                private MotionEventTracker() {
                }

                public static MotionEventTracker getInstance() {
/* 3 */             if (INSTANCE == null) {
/* 10 */                INSTANCE = new MotionEventTracker();
                    }
/* 12 */            return INSTANCE;
                }

                public MotionEvent pop(MotionEventId motionEventId) {
/* 7 */             while (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() < motionEventId.f9737id) {
/* 43 */                this.eventById.remove(this.unusedEvents.poll().longValue());
                    }
/* 53 */            if (!this.unusedEvents.isEmpty() && this.unusedEvents.peek().longValue() == motionEventId.f9737id) {
/* 77 */                this.unusedEvents.poll();
                    }
/* 86 */            MotionEvent motionEvent = this.eventById.get(motionEventId.f9737id);
/* 98 */            this.eventById.remove(motionEventId.f9737id);
/* 101 */           return motionEvent;
                }

                public MotionEventId track(MotionEvent motionEvent) {
/* 1 */             MotionEventId motionEventIdCreateUnique = MotionEventId.createUnique();
/* 15 */            this.eventById.put(motionEventIdCreateUnique.f9737id, MotionEvent.obtain(motionEvent));
/* 28 */            this.unusedEvents.add(Long.valueOf(motionEventIdCreateUnique.f9737id));
/* 31 */            return motionEventIdCreateUnique;
                }
            }
