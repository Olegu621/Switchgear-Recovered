            package okio;

            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import java.util.Arrays;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            import p000.C1960nd;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0000J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m6176d2 = {"Lokio/Segment;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", SharedDataContentProvider.BASE_PATH, HttpUrl.FRAGMENT_ENCODE_SET, "pos", HttpUrl.FRAGMENT_ENCODE_SET, "limit", "shared", HttpUrl.FRAGMENT_ENCODE_SET, "owner", "([BIIZZ)V", "next", "prev", "compact", HttpUrl.FRAGMENT_ENCODE_SET, "pop", "push", "segment", "sharedCopy", "split", "byteCount", "unsharedCopy", "writeTo", "sink", "Companion", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 16 */    public final class Segment {
                public static final int SHARE_MINIMUM = 1024;
                public static final int SIZE = 8192;
                public final byte[] data;
                public int limit;
                public Segment next;
                public boolean owner;
                public int pos;
                public Segment prev;
                public boolean shared;

                public Segment(byte[] bArr, int i, int i2, boolean z, boolean z2) {
/* 1 */             bArr.getClass();
/* 7 */             this.data = bArr;
/* 9 */             this.pos = i;
/* 11 */            this.limit = i2;
/* 13 */            this.shared = z;
/* 15 */            this.owner = z2;
                }

                public final void compact() {
                    int i;
/* 1 */             Segment segment = this.prev;
/* 3 */             if (segment == this) {
/* 66 */                f42.m3656l("cannot compact");
/* 69 */                return;
                    }
/* 5 */             segment.getClass();
/* 10 */            if (segment.owner) {
/* 17 */                int i2 = this.limit - this.pos;
/* 18 */                Segment segment2 = this.prev;
/* 20 */                segment2.getClass();
/* 25 */                int i3 = 8192 - segment2.limit;
/* 27 */                Segment segment3 = this.prev;
/* 29 */                segment3.getClass();
/* 34 */                if (segment3.shared) {
/* 36 */                    i = 0;
                        } else {
/* 38 */                    Segment segment4 = this.prev;
/* 40 */                    segment4.getClass();
/* 43 */                    i = segment4.pos;
                        }
/* 46 */                if (i2 > i3 + i) {
/* 48 */                    return;
                        }
/* 49 */                Segment segment5 = this.prev;
/* 51 */                segment5.getClass();
/* 54 */                writeTo(segment5, i2);
/* 57 */                pop();
/* 60 */                SegmentPool.recycle(this);
                    }
                }

                public final Segment pop() {
/* 1 */             Segment segment = this.next;
/* 4 */             if (segment == this) {
/* 7 */                 segment = null;
                    }
/* 8 */             Segment segment2 = this.prev;
/* 10 */            segment2.getClass();
/* 15 */            segment2.next = this.next;
/* 17 */            Segment segment3 = this.next;
/* 19 */            segment3.getClass();
/* 24 */            segment3.prev = this.prev;
/* 26 */            this.next = null;
/* 28 */            this.prev = null;
/* 30 */            return segment;
                }

                public final Segment push(Segment segment) {
/* 1 */             segment.getClass();
/* 4 */             segment.prev = this;
/* 8 */             segment.next = this.next;
/* 10 */            Segment segment2 = this.next;
/* 12 */            segment2.getClass();
/* 15 */            segment2.prev = segment;
/* 17 */            this.next = segment;
/* 19 */            return segment;
                }

                public final Segment sharedCopy() {
/* 2 */             this.shared = true;
/* 14 */            return new Segment(this.data, this.pos, this.limit, true, false);
                }

                public final Segment split(int byteCount) {
                    Segment segmentTake;
/* 1 */             if (byteCount <= 0 || byteCount > this.limit - this.pos) {
/* 56 */                C1951n4.m6859j("byteCount out of range");
/* 59 */                return null;
                    }
/* 12 */            if (byteCount >= 1024) {
/* 14 */                segmentTake = sharedCopy();
                    } else {
/* 19 */                segmentTake = SegmentPool.take();
/* 23 */                byte[] bArr = this.data;
/* 25 */                byte[] bArr2 = segmentTake.data;
/* 27 */                int i = this.pos;
/* 32 */                C1960nd.m6964b(bArr, 0, bArr2, i, i + byteCount);
                    }
/* 38 */            segmentTake.limit = segmentTake.pos + byteCount;
/* 43 */            this.pos += byteCount;
/* 45 */            Segment segment = this.prev;
/* 47 */            segment.getClass();
/* 50 */            segment.push(segmentTake);
/* 53 */            return segmentTake;
                }

                public final Segment unsharedCopy() {
/* 3 */             byte[] bArr = this.data;
/* 16 */            return new Segment(Arrays.copyOf(bArr, bArr.length), this.pos, this.limit, false, true);
                }

                public final void writeTo(Segment sink, int byteCount) {
/* 1 */             sink.getClass();
/* 6 */             if (!sink.owner) {
/* 75 */                f42.m3656l("only owner can write");
/* 78 */                return;
                    }
/* 8 */             int i = sink.limit;
/* 10 */            int i2 = i + byteCount;
/* 14 */            if (i2 > 8192) {
/* 18 */                if (sink.shared) {
/* 45 */                    f42.m3649e();
/* 48 */                    return;
                        }
/* 20 */                int i3 = sink.pos;
/* 23 */                if (i2 - i3 > 8192) {
/* 41 */                    f42.m3649e();
/* 44 */                    return;
                        }
/* 25 */                byte[] bArr = sink.data;
/* 28 */                C1960nd.m6964b(bArr, 0, bArr, i3, i);
/* 36 */                sink.limit -= sink.pos;
/* 38 */                sink.pos = 0;
                    }
/* 49 */            byte[] bArr2 = this.data;
/* 51 */            byte[] bArr3 = sink.data;
/* 53 */            int i4 = sink.limit;
/* 55 */            int i5 = this.pos;
/* 59 */            C1960nd.m6964b(bArr2, i4, bArr3, i5, i5 + byteCount);
/* 65 */            sink.limit += byteCount;
/* 70 */            this.pos += byteCount;
                }

/* 17 */        public Segment() {
/* 19 */            this.data = new byte[SIZE];
/* 20 */            this.owner = true;
/* 21 */            this.shared = false;
                }
            }
