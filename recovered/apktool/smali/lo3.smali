.class public final Llo3;
.super Lwg3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public c:Lcom/google/android/gms/internal/measurement/zzcn;

.field public d:Z

.field public final e:Lpi3;

.field public final f:Lio/sentry/android/core/internal/tombstone/b;

.field public final i:Lwe2;


# direct methods
.method public constructor <init>(Lij3;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lwg3;-><init>(Lij3;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Llo3;->d:Z

    .line 6
    .line 7
    new-instance p1, Lpi3;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Lpi3;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Llo3;->e:Lpi3;

    .line 13
    .line 14
    new-instance p1, Lio/sentry/android/core/internal/tombstone/b;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p0, p1, Lio/sentry/android/core/internal/tombstone/b;->d:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v0, Ldo3;

    .line 22
    .line 23
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lij3;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v0, p1, v1, v2}, Ldo3;-><init>(Ljava/lang/Object;Ljk3;I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p1, Lio/sentry/android/core/internal/tombstone/b;->c:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v0, v1, Lij3;->V:Lxt0;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iput-wide v0, p1, Lio/sentry/android/core/internal/tombstone/b;->a:J

    .line 43
    .line 44
    iput-wide v0, p1, Lio/sentry/android/core/internal/tombstone/b;->b:J

    .line 45
    .line 46
    iput-object p1, p0, Llo3;->f:Lio/sentry/android/core/internal/tombstone/b;

    .line 47
    .line 48
    new-instance p1, Lwe2;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lwe2;-><init>(Llo3;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Llo3;->i:Lwe2;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final D()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Leg3;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llo3;->c:Lcom/google/android/gms/internal/measurement/zzcn;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcn;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcn;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Llo3;->c:Lcom/google/android/gms/internal/measurement/zzcn;

    .line 18
    .line 19
    :cond_0
    return-void
.end method
