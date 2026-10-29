.class public final Lio/sentry/android/core/performance/a;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lio/sentry/t4;

.field public c:Lio/sentry/t4;

.field public d:Lio/sentry/k1;

.field public e:Lio/sentry/k1;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lio/sentry/android/core/performance/a;->b:Lio/sentry/t4;

    .line 6
    .line 7
    iput-object v0, p0, Lio/sentry/android/core/performance/a;->c:Lio/sentry/t4;

    .line 8
    .line 9
    iput-object v0, p0, Lio/sentry/android/core/performance/a;->d:Lio/sentry/k1;

    .line 10
    .line 11
    iput-object v0, p0, Lio/sentry/android/core/performance/a;->e:Lio/sentry/k1;

    .line 12
    .line 13
    iput-object p1, p0, Lio/sentry/android/core/performance/a;->a:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Lio/sentry/k1;Ljava/lang/String;Lio/sentry/t4;)Lio/sentry/k1;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/r1;->SENTRY:Lio/sentry/r1;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, v0}, Lio/sentry/k1;->c(Ljava/lang/String;Lio/sentry/t4;Lio/sentry/r1;)Lio/sentry/k1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lio/sentry/android/core/internal/util/e;->d(Ljava/lang/Thread;)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string p2, "thread.id"

    .line 24
    .line 25
    invoke-interface {p0, p1, p2}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string p1, "thread.name"

    .line 29
    .line 30
    const-string p2, "main"

    .line 31
    .line 32
    invoke-interface {p0, p2, p1}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    const-string p2, "ui.contributes_to_ttid"

    .line 38
    .line 39
    invoke-interface {p0, p1, p2}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p2, "ui.contributes_to_ttfd"

    .line 43
    .line 44
    invoke-interface {p0, p1, p2}, Lio/sentry/k1;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object p0
.end method
