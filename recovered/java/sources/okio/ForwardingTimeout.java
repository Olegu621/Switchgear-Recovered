            package okio;

            import java.io.IOException;
            import java.util.concurrent.TimeUnit;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\u0001H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016R\u001c\u0010\u0002\u001a\u00020\u00018\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0003¨\u0006\u0012"}, m6176d2 = {"Lokio/ForwardingTimeout;", "Lokio/Timeout;", "delegate", "(Lokio/Timeout;)V", "()Lokio/Timeout;", "setDelegate", "clearDeadline", "clearTimeout", "deadlineNanoTime", HttpUrl.FRAGMENT_ENCODE_SET, "hasDeadline", HttpUrl.FRAGMENT_ENCODE_SET, "throwIfReached", HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "timeoutNanos", "okio"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 5 */     public class ForwardingTimeout extends Timeout {
                private Timeout delegate;

                public ForwardingTimeout(Timeout timeout) {
/* 1 */             timeout.getClass();
/* 7 */             this.delegate = timeout;
                }

                @Override // okio.Timeout
                public Timeout clearDeadline() {
/* 3 */             return this.delegate.clearDeadline();
                }

                @Override // okio.Timeout
                public Timeout clearTimeout() {
/* 3 */             return this.delegate.clearTimeout();
                }

                @Override // okio.Timeout
                public long deadlineNanoTime() {
/* 3 */             return this.delegate.deadlineNanoTime();
                }

                /* JADX INFO: renamed from: delegate, reason: from getter */
                public final Timeout getDelegate() {
/* 1 */             return this.delegate;
                }

                @Override // okio.Timeout
                /* JADX INFO: renamed from: hasDeadline */
                public boolean getHasDeadline() {
/* 3 */             return this.delegate.getHasDeadline();
                }

                /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
                public final /* synthetic */ void m10654setDelegate(Timeout timeout) {
/* 1 */             timeout.getClass();
/* 4 */             this.delegate = timeout;
                }

                @Override // okio.Timeout
                public void throwIfReached() throws IOException {
/* 3 */             this.delegate.throwIfReached();
                }

                @Override // okio.Timeout
                public Timeout timeout(long timeout, TimeUnit unit) {
/* 1 */             unit.getClass();
/* 6 */             return this.delegate.timeout(timeout, unit);
                }

                @Override // okio.Timeout
                /* JADX INFO: renamed from: timeoutNanos */
                public long getTimeoutNanos() {
/* 3 */             return this.delegate.getTimeoutNanos();
                }

/* 6 */         public final ForwardingTimeout setDelegate(Timeout delegate) {
                    delegate.getClass();
/* 7 */             this.delegate = delegate;
                    return this;
                }

                @Override // okio.Timeout
/* 7 */         public Timeout deadlineNanoTime(long deadlineNanoTime) {
/* 8 */             return this.delegate.deadlineNanoTime(deadlineNanoTime);
                }
            }
