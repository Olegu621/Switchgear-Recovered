.class public Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;
.super Lcom/google/android/gms/internal/measurement/zzcq;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lij3;

.field public final b:Lid;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzcq;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 6
    .line 7
    new-instance v0, Lid;

    .line 8
    .line 9
    invoke-direct {v0}, Lle2;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lid;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Attempting to perform action before initialize."

    .line 7
    .line 8
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lup3;->h0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public beginAdUnitExposure(Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->Y:Lof3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->i(Leg3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lof3;->A(Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lsl3;->N(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public clearMeasurementEnabled(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lwg3;->A()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lij3;

    .line 17
    .line 18
    iget-object p1, p1, Lij3;->i:Lbj3;

    .line 19
    .line 20
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lcp0;

    .line 24
    .line 25
    const/16 v0, 0x1d

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {p2, p0, v2, v0, v1}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public endAdUnitExposure(Ljava/lang/String;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->Y:Lof3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->i(Leg3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, Lof3;->B(Ljava/lang/String;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public generateEventId(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->w:Lup3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lup3;->v0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 19
    .line 20
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 21
    .line 22
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0, v1}, Lup3;->i0(Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public getAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcp0;

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, p1, v2, v3}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public getCachedAppInstanceId(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lur;

    .line 12
    .line 13
    const/4 v6, 0x6

    .line 14
    move-object v2, p0

    .line 15
    move-object v4, p1

    .line 16
    move-object v5, p2

    .line 17
    move-object v3, p3

    .line 18
    invoke-direct/range {v1 .. v6}, Lur;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getCurrentScreenClass(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    iget-object v0, v0, Lij3;->W:Llm3;

    .line 16
    .line 17
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Llm3;->c:Lbm3;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lbm3;->b:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public getCurrentScreenName(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    iget-object v0, v0, Lij3;->W:Llm3;

    .line 16
    .line 17
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Llm3;->c:Lbm3;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lbm3;->a:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public getGmpAppId(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    :try_start_0
    iget-object v1, v0, Lij3;->a:Landroid/content/Context;

    .line 16
    .line 17
    iget-object v2, v0, Lij3;->a0:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v1, v2}, Lqj3;->S(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v1

    .line 25
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 26
    .line 27
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 31
    .line 32
    const-string v2, "getGoogleAppId failed with exception"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    :goto_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public getMaxUserProperties(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Lkb1;->k(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lij3;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 25
    .line 26
    iget-object p0, p0, Lij3;->w:Lup3;

    .line 27
    .line 28
    invoke-static {p0}, Lij3;->j(Lsq3;)V

    .line 29
    .line 30
    .line 31
    const/16 p1, 0x19

    .line 32
    .line 33
    invoke-virtual {p0, p2, p1}, Lup3;->j0(Lcom/google/android/gms/internal/measurement/zzcu;I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public getSessionId(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 16
    .line 17
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ldp0;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, Ldp0;-><init>(Lsl3;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public getTestFlag(Lcom/google/android/gms/internal/measurement/zzcu;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eqz p2, :cond_4

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eq p2, v0, :cond_3

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq p2, v2, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p2, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-eq p2, v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 21
    .line 22
    iget-object p2, p2, Lij3;->w:Lup3;

    .line 23
    .line 24
    invoke-static {p2}, Lij3;->j(Lsq3;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 28
    .line 29
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 30
    .line 31
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lij3;

    .line 42
    .line 43
    iget-object v2, v0, Lij3;->i:Lbj3;

    .line 44
    .line 45
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 46
    .line 47
    .line 48
    new-instance v7, Lgl3;

    .line 49
    .line 50
    invoke-direct {v7, p0, v3, v1}, Lgl3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 51
    .line 52
    .line 53
    const-wide/16 v4, 0x3a98

    .line 54
    .line 55
    const-string v6, "boolean test flag value"

    .line 56
    .line 57
    invoke-virtual/range {v2 .. v7}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {p2, p1, p0}, Lup3;->l0(Lcom/google/android/gms/internal/measurement/zzcu;Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 72
    .line 73
    iget-object p2, p2, Lij3;->w:Lup3;

    .line 74
    .line 75
    invoke-static {p2}, Lij3;->j(Lsq3;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 79
    .line 80
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 81
    .line 82
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 83
    .line 84
    .line 85
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 86
    .line 87
    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lij3;

    .line 93
    .line 94
    iget-object v3, v0, Lij3;->i:Lbj3;

    .line 95
    .line 96
    invoke-static {v3}, Lij3;->l(Lhk3;)V

    .line 97
    .line 98
    .line 99
    new-instance v8, Lgl3;

    .line 100
    .line 101
    invoke-direct {v8, p0, v4, v2}, Lgl3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 102
    .line 103
    .line 104
    const-wide/16 v5, 0x3a98

    .line 105
    .line 106
    const-string v7, "int test flag value"

    .line 107
    .line 108
    invoke-virtual/range {v3 .. v8}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-virtual {p2, p1, p0}, Lup3;->j0(Lcom/google/android/gms/internal/measurement/zzcu;I)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 123
    .line 124
    iget-object p2, p2, Lij3;->w:Lup3;

    .line 125
    .line 126
    invoke-static {p2}, Lij3;->j(Lsq3;)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 130
    .line 131
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 132
    .line 133
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 137
    .line 138
    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v1, Lij3;

    .line 144
    .line 145
    iget-object v1, v1, Lij3;->i:Lbj3;

    .line 146
    .line 147
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 148
    .line 149
    .line 150
    new-instance v6, Lil3;

    .line 151
    .line 152
    invoke-direct {v6, p0, v2, v0}, Lil3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 153
    .line 154
    .line 155
    const-wide/16 v3, 0x3a98

    .line 156
    .line 157
    const-string v5, "double test flag value"

    .line 158
    .line 159
    invoke-virtual/range {v1 .. v6}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    check-cast p0, Ljava/lang/Double;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 166
    .line 167
    .line 168
    move-result-wide v0

    .line 169
    new-instance p0, Landroid/os/Bundle;

    .line 170
    .line 171
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v2, "r"

    .line 175
    .line 176
    invoke-virtual {p0, v2, v0, v1}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 177
    .line 178
    .line 179
    :try_start_0
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/measurement/zzcu;->zzb(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :catch_0
    move-exception v0

    .line 184
    move-object p0, v0

    .line 185
    iget-object p1, p2, Lsq3;->a:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Lij3;

    .line 188
    .line 189
    iget-object p1, p1, Lij3;->f:Luh3;

    .line 190
    .line 191
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 192
    .line 193
    .line 194
    iget-object p1, p1, Luh3;->w:Lsh3;

    .line 195
    .line 196
    const-string p2, "Error returning double value to wrapper"

    .line 197
    .line 198
    invoke-virtual {p1, p0, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 203
    .line 204
    iget-object p2, p2, Lij3;->w:Lup3;

    .line 205
    .line 206
    invoke-static {p2}, Lij3;->j(Lsq3;)V

    .line 207
    .line 208
    .line 209
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 210
    .line 211
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 212
    .line 213
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 214
    .line 215
    .line 216
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 219
    .line 220
    .line 221
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Lij3;

    .line 224
    .line 225
    iget-object v2, v0, Lij3;->i:Lbj3;

    .line 226
    .line 227
    invoke-static {v2}, Lij3;->l(Lhk3;)V

    .line 228
    .line 229
    .line 230
    new-instance v7, Lil3;

    .line 231
    .line 232
    invoke-direct {v7, p0, v3, v1}, Lil3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 233
    .line 234
    .line 235
    const-wide/16 v4, 0x3a98

    .line 236
    .line 237
    const-string v6, "long test flag value"

    .line 238
    .line 239
    invoke-virtual/range {v2 .. v7}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    check-cast p0, Ljava/lang/Long;

    .line 244
    .line 245
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 246
    .line 247
    .line 248
    move-result-wide v0

    .line 249
    invoke-virtual {p2, p1, v0, v1}, Lup3;->i0(Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 254
    .line 255
    iget-object p2, p2, Lij3;->w:Lup3;

    .line 256
    .line 257
    invoke-static {p2}, Lij3;->j(Lsq3;)V

    .line 258
    .line 259
    .line 260
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 261
    .line 262
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 263
    .line 264
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 265
    .line 266
    .line 267
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 268
    .line 269
    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 270
    .line 271
    .line 272
    iget-object v1, p0, Lsq3;->a:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lij3;

    .line 275
    .line 276
    iget-object v1, v1, Lij3;->i:Lbj3;

    .line 277
    .line 278
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 279
    .line 280
    .line 281
    new-instance v6, Lgl3;

    .line 282
    .line 283
    invoke-direct {v6, p0, v2, v0}, Lgl3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 284
    .line 285
    .line 286
    const-wide/16 v3, 0x3a98

    .line 287
    .line 288
    const-string v5, "String test flag value"

    .line 289
    .line 290
    invoke-virtual/range {v1 .. v6}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    check-cast p0, Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {p2, p0, p1}, Lup3;->h0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzcu;)V

    .line 297
    .line 298
    .line 299
    return-void
.end method

.method public getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lft0;

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    move-object v4, p1

    .line 15
    move-object v5, p2

    .line 16
    move v6, p3

    .line 17
    move-object v3, p4

    .line 18
    invoke-direct/range {v1 .. v6}, Lft0;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzcu;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public initForTests(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public initialize(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/measurement/zzdd;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-static {p1, p2, p3}, Lij3;->r(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lij3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object p0, v0, Lij3;->f:Luh3;

    .line 26
    .line 27
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 31
    .line 32
    const-string p1, "Attempting to initialize multiple times"

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public isDataCollectionEnabled(Lcom/google/android/gms/internal/measurement/zzcu;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lol3;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, v2, p0, p1}, Lol3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    move-object v1, p1

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move v4, p4

    .line 15
    move v5, p5

    .line 16
    move-wide v6, p6

    .line 17
    invoke-virtual/range {v0 .. v7}, Lsl3;->E(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcu;J)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkb1;->k(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 18
    .line 19
    .line 20
    :goto_0
    const-string v1, "_o"

    .line 21
    .line 22
    const-string v5, "app"

    .line 23
    .line 24
    invoke-virtual {v0, v1, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lcom/google/android/gms/measurement/internal/zzbg;

    .line 28
    .line 29
    new-instance v4, Lcom/google/android/gms/measurement/internal/zzbe;

    .line 30
    .line 31
    invoke-direct {v4, p3}, Lcom/google/android/gms/measurement/internal/zzbe;-><init>(Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    move-object v3, p2

    .line 35
    move-wide v6, p5

    .line 36
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/measurement/internal/zzbg;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbe;Ljava/lang/String;J)V

    .line 37
    .line 38
    .line 39
    move-object p3, v2

    .line 40
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 41
    .line 42
    iget-object p6, p2, Lij3;->i:Lbj3;

    .line 43
    .line 44
    invoke-static {p6}, Lij3;->l(Lhk3;)V

    .line 45
    .line 46
    .line 47
    move-object p2, p4

    .line 48
    move-object p4, p1

    .line 49
    move-object p1, p0

    .line 50
    new-instance p0, Lur;

    .line 51
    .line 52
    const/4 p5, 0x3

    .line 53
    invoke-direct/range {p0 .. p5}, Lur;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p6, p0}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public logHealthData(ILjava/lang/String;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    move-object v6, v0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p3}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    move-object v6, p3

    .line 14
    :goto_0
    if-nez p4, :cond_1

    .line 15
    .line 16
    move-object v7, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-static {p4}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    move-object v7, p3

    .line 23
    :goto_1
    if-nez p5, :cond_2

    .line 24
    .line 25
    :goto_2
    move-object v8, v0

    .line 26
    goto :goto_3

    .line 27
    :cond_2
    invoke-static {p5}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_2

    .line 32
    :goto_3
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 33
    .line 34
    iget-object v1, p0, Lij3;->f:Luh3;

    .line 35
    .line 36
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const/4 v4, 0x0

    .line 41
    move v2, p1

    .line 42
    move-object v5, p2

    .line 43
    invoke-virtual/range {v1 .. v8}, Luh3;->I(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public onActivityCreated(Lcom/google/android/gms/dynamic/IObjectWrapper;Landroid/os/Bundle;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivityCreatedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityCreatedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;J)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p3, p3, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p3}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p3, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 16
    .line 17
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 18
    .line 19
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lsl3;->R()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, p1, p2}, Ldh0;->n(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivityDestroyedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityDestroyedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p2, p2, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p2}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p2, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 16
    .line 17
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 18
    .line 19
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lsl3;->R()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ldh0;->o(Lcom/google/android/gms/internal/measurement/zzdf;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onActivityPaused(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivityPausedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityPausedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p2, p2, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p2}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p2, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 16
    .line 17
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 18
    .line 19
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lsl3;->R()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ldh0;->p(Lcom/google/android/gms/internal/measurement/zzdf;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onActivityResumed(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivityResumedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityResumedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p2, p2, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p2}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p2, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 16
    .line 17
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 18
    .line 19
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lsl3;->R()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ldh0;->q(Lcom/google/android/gms/internal/measurement/zzdf;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Lcom/google/android/gms/dynamic/IObjectWrapper;Lcom/google/android/gms/internal/measurement/zzcu;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcu;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivitySaveInstanceStateByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Lcom/google/android/gms/internal/measurement/zzcu;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p3, p3, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p3}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p3, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    new-instance p4, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 21
    .line 22
    iget-object v0, v0, Lij3;->X:Lsl3;

    .line 23
    .line 24
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lsl3;->R()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3, p1, p4}, Ldh0;->r(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    :try_start_0
    invoke-interface {p2, p4}, Lcom/google/android/gms/internal/measurement/zzcu;->zzb(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p1

    .line 38
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 39
    .line 40
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 41
    .line 42
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 46
    .line 47
    const-string p2, "Error returning bundle value to wrapper"

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public onActivityStarted(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivityStartedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityStartedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p1, p1, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p1}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 16
    .line 17
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 18
    .line 19
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lsl3;->R()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public onActivityStopped(Lcom/google/android/gms/dynamic/IObjectWrapper;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->onActivityStoppedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onActivityStoppedByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p1, p1, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p1}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p1, Lsl3;->c:Ldh0;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 16
    .line 17
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 18
    .line 19
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lsl3;->R()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public performAction(Landroid/os/Bundle;Lcom/google/android/gms/internal/measurement/zzcu;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    invoke-interface {p2, p0}, Lcom/google/android/gms/internal/measurement/zzcu;->zzb(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public registerOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lid;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zzf()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v1, v2}, Lle2;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lrk3;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lfq3;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, Lfq3;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zzf()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1, v1}, Lle2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 45
    .line 46
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 47
    .line 48
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lwg3;->A()V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lsl3;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lij3;

    .line 65
    .line 66
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 67
    .line 68
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 72
    .line 73
    const-string p1, "OnEventListener already registered"

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void

    .line 79
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p0
.end method

.method public resetAnalyticsData(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lsl3;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lij3;

    .line 20
    .line 21
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 22
    .line 23
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lzk3;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, p1, p2, v2}, Lzk3;-><init>(Lsl3;JI)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public retrieveAndUploadBatches(Lcom/google/android/gms/internal/measurement/zzcx;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 7
    .line 8
    iget-object v2, v0, Lij3;->X:Lsl3;

    .line 9
    .line 10
    invoke-static {v2}, Lij3;->k(Lwg3;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lwg3;->A()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lij3;

    .line 20
    .line 21
    iget-object v0, v3, Lij3;->i:Lbj3;

    .line 22
    .line 23
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lbj3;->F()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_c

    .line 31
    .line 32
    iget-object v0, v3, Lij3;->i:Lbj3;

    .line 33
    .line 34
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    iget-object v0, v0, Lbj3;->d:Lzi3;

    .line 42
    .line 43
    if-ne v4, v0, :cond_0

    .line 44
    .line 45
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 46
    .line 47
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 51
    .line 52
    const-string v1, "Cannot retrieve and upload batches from analytics network thread"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    invoke-static {}, Lq62;->g()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v4, v3, Lij3;->f:Luh3;

    .line 63
    .line 64
    if-nez v0, :cond_b

    .line 65
    .line 66
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v4, Luh3;->Y:Lsh3;

    .line 70
    .line 71
    const-string v4, "[sgtm] Started client-side batch upload work."

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Lsh3;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    :goto_0
    if-nez v0, :cond_a

    .line 80
    .line 81
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 82
    .line 83
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 87
    .line 88
    const-string v7, "[sgtm] Getting upload batches from service (FE)"

    .line 89
    .line 90
    invoke-virtual {v0, v7}, Lsh3;->a(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v9, Ljava/util/concurrent/atomic/AtomicReference;

    .line 94
    .line 95
    invoke-direct {v9}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v8, v3, Lij3;->i:Lbj3;

    .line 99
    .line 100
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 101
    .line 102
    .line 103
    new-instance v13, Lil3;

    .line 104
    .line 105
    const/4 v0, 0x2

    .line 106
    invoke-direct {v13, v2, v9, v0}, Lil3;-><init>(Lsl3;Ljava/util/concurrent/atomic/AtomicReference;I)V

    .line 107
    .line 108
    .line 109
    const-wide/16 v10, 0x2710

    .line 110
    .line 111
    const-string v12, "[sgtm] Getting upload batches"

    .line 112
    .line 113
    invoke-virtual/range {v8 .. v13}, Lbj3;->J(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzop;

    .line 121
    .line 122
    if-eqz v0, :cond_a

    .line 123
    .line 124
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzop;->a:Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_1

    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :cond_1
    iget-object v7, v3, Lij3;->f:Luh3;

    .line 135
    .line 136
    invoke-static {v7}, Lij3;->l(Lhk3;)V

    .line 137
    .line 138
    .line 139
    iget-object v7, v7, Luh3;->Y:Lsh3;

    .line 140
    .line 141
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    const-string v9, "[sgtm] Retrieved upload batches. count"

    .line 150
    .line 151
    invoke-virtual {v7, v8, v9}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    add-int/2addr v5, v7

    .line 159
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_9

    .line 168
    .line 169
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    move-object v8, v0

    .line 174
    check-cast v8, Lcom/google/android/gms/measurement/internal/zzol;

    .line 175
    .line 176
    :try_start_0
    new-instance v0, Ljava/net/URI;

    .line 177
    .line 178
    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzol;->c:Ljava/lang/String;

    .line 179
    .line 180
    invoke-direct {v0, v9}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 184
    .line 185
    .line 186
    move-result-object v13
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1

    .line 187
    new-instance v9, Ljava/util/concurrent/atomic/AtomicReference;

    .line 188
    .line 189
    invoke-direct {v9}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 190
    .line 191
    .line 192
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Lij3;

    .line 195
    .line 196
    invoke-virtual {v0}, Lij3;->q()Lih3;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0}, Lwg3;->A()V

    .line 201
    .line 202
    .line 203
    iget-object v10, v0, Lih3;->i:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v10}, Lkb1;->n(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object v12, v0, Lih3;->i:Ljava/lang/String;

    .line 209
    .line 210
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lij3;

    .line 213
    .line 214
    iget-object v10, v0, Lij3;->f:Luh3;

    .line 215
    .line 216
    invoke-static {v10}, Lij3;->l(Lhk3;)V

    .line 217
    .line 218
    .line 219
    iget-object v10, v10, Luh3;->Y:Lsh3;

    .line 220
    .line 221
    iget-wide v14, v8, Lcom/google/android/gms/measurement/internal/zzol;->a:J

    .line 222
    .line 223
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 224
    .line 225
    .line 226
    move-result-object v11

    .line 227
    iget-object v14, v8, Lcom/google/android/gms/measurement/internal/zzol;->c:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v15, v8, Lcom/google/android/gms/measurement/internal/zzol;->b:[B

    .line 230
    .line 231
    array-length v15, v15

    .line 232
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v15

    .line 236
    const-string v4, "[sgtm] Uploading data from app. row_id, url, uncompressed size"

    .line 237
    .line 238
    invoke-virtual {v10, v4, v11, v14, v15}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    iget-object v4, v8, Lcom/google/android/gms/measurement/internal/zzol;->i:Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    if-nez v4, :cond_3

    .line 248
    .line 249
    iget-object v4, v0, Lij3;->f:Luh3;

    .line 250
    .line 251
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 252
    .line 253
    .line 254
    iget-object v4, v4, Luh3;->Y:Lsh3;

    .line 255
    .line 256
    iget-object v10, v8, Lcom/google/android/gms/measurement/internal/zzol;->i:Ljava/lang/String;

    .line 257
    .line 258
    const-string v14, "[sgtm] Uploading data from app. row_id"

    .line 259
    .line 260
    invoke-virtual {v4, v11, v14, v10}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :cond_3
    new-instance v15, Ljava/util/HashMap;

    .line 264
    .line 265
    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 266
    .line 267
    .line 268
    iget-object v4, v8, Lcom/google/android/gms/measurement/internal/zzol;->d:Landroid/os/Bundle;

    .line 269
    .line 270
    invoke-virtual {v4}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    :cond_4
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    if-eqz v11, :cond_5

    .line 283
    .line 284
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    check-cast v11, Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v4, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v14

    .line 294
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 295
    .line 296
    .line 297
    move-result v16

    .line 298
    if-nez v16, :cond_4

    .line 299
    .line 300
    invoke-virtual {v15, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    goto :goto_2

    .line 304
    :cond_5
    iget-object v11, v0, Lij3;->Z:Lwl3;

    .line 305
    .line 306
    invoke-static {v11}, Lij3;->l(Lhk3;)V

    .line 307
    .line 308
    .line 309
    iget-object v14, v8, Lcom/google/android/gms/measurement/internal/zzol;->b:[B

    .line 310
    .line 311
    new-instance v4, Lac1;

    .line 312
    .line 313
    const/16 v10, 0x1d

    .line 314
    .line 315
    invoke-direct {v4, v10, v2, v9, v8}, Lac1;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v11}, Lhk3;->B()V

    .line 319
    .line 320
    .line 321
    invoke-static {v13}, Lkb1;->n(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v14}, Lkb1;->n(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    iget-object v8, v11, Lsq3;->a:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v8, Lij3;

    .line 330
    .line 331
    iget-object v8, v8, Lij3;->i:Lbj3;

    .line 332
    .line 333
    invoke-static {v8}, Lij3;->l(Lhk3;)V

    .line 334
    .line 335
    .line 336
    new-instance v10, Leu0;

    .line 337
    .line 338
    move-object/from16 v16, v4

    .line 339
    .line 340
    invoke-direct/range {v10 .. v16}, Leu0;-><init>(Lwl3;Ljava/lang/String;Ljava/net/URL;[BLjava/util/HashMap;Lul3;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8, v10}, Lbj3;->L(Ljava/lang/Runnable;)V

    .line 344
    .line 345
    .line 346
    :try_start_1
    iget-object v0, v0, Lij3;->w:Lup3;

    .line 347
    .line 348
    invoke-static {v0}, Lij3;->j(Lsq3;)V

    .line 349
    .line 350
    .line 351
    iget-object v0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Lij3;

    .line 354
    .line 355
    iget-object v4, v0, Lij3;->V:Lxt0;

    .line 356
    .line 357
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 361
    .line 362
    .line 363
    move-result-wide v10

    .line 364
    const-wide/32 v12, 0xea60

    .line 365
    .line 366
    .line 367
    add-long/2addr v10, v12

    .line 368
    monitor-enter v9
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 369
    :goto_3
    :try_start_2
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    if-nez v4, :cond_6

    .line 374
    .line 375
    const-wide/16 v14, 0x0

    .line 376
    .line 377
    cmp-long v4, v12, v14

    .line 378
    .line 379
    if-lez v4, :cond_6

    .line 380
    .line 381
    invoke-virtual {v9, v12, v13}, Ljava/lang/Object;->wait(J)V

    .line 382
    .line 383
    .line 384
    iget-object v4, v0, Lij3;->V:Lxt0;

    .line 385
    .line 386
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 390
    .line 391
    .line 392
    move-result-wide v12

    .line 393
    sub-long v12, v10, v12

    .line 394
    .line 395
    goto :goto_3

    .line 396
    :catchall_0
    move-exception v0

    .line 397
    goto :goto_4

    .line 398
    :cond_6
    monitor-exit v9

    .line 399
    goto :goto_5

    .line 400
    :goto_4
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 401
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 402
    :catch_0
    iget-object v0, v2, Lsq3;->a:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, Lij3;

    .line 405
    .line 406
    iget-object v0, v0, Lij3;->f:Luh3;

    .line 407
    .line 408
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 409
    .line 410
    .line 411
    iget-object v0, v0, Luh3;->w:Lsh3;

    .line 412
    .line 413
    const-string v4, "[sgtm] Interrupted waiting for uploading batch"

    .line 414
    .line 415
    invoke-virtual {v0, v4}, Lsh3;->a(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    :goto_5
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    if-nez v0, :cond_7

    .line 423
    .line 424
    sget-object v0, Lyl3;->b:Lyl3;

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_7
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v0, Lyl3;

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :catch_1
    move-exception v0

    .line 435
    goto :goto_6

    .line 436
    :catch_2
    move-exception v0

    .line 437
    :goto_6
    iget-object v4, v2, Lsq3;->a:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v4, Lij3;

    .line 440
    .line 441
    iget-object v4, v4, Lij3;->f:Luh3;

    .line 442
    .line 443
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 444
    .line 445
    .line 446
    iget-object v4, v4, Luh3;->f:Lsh3;

    .line 447
    .line 448
    iget-object v9, v8, Lcom/google/android/gms/measurement/internal/zzol;->c:Ljava/lang/String;

    .line 449
    .line 450
    iget-wide v10, v8, Lcom/google/android/gms/measurement/internal/zzol;->a:J

    .line 451
    .line 452
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    const-string v10, "[sgtm] Bad upload url for row_id"

    .line 457
    .line 458
    invoke-virtual {v4, v10, v9, v8, v0}, Lsh3;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    sget-object v0, Lyl3;->d:Lyl3;

    .line 462
    .line 463
    :goto_7
    sget-object v4, Lyl3;->c:Lyl3;

    .line 464
    .line 465
    if-ne v0, v4, :cond_8

    .line 466
    .line 467
    add-int/lit8 v6, v6, 0x1

    .line 468
    .line 469
    goto/16 :goto_1

    .line 470
    .line 471
    :cond_8
    sget-object v4, Lyl3;->e:Lyl3;

    .line 472
    .line 473
    if-ne v0, v4, :cond_2

    .line 474
    .line 475
    const/4 v0, 0x1

    .line 476
    goto/16 :goto_0

    .line 477
    .line 478
    :cond_9
    const/4 v0, 0x0

    .line 479
    goto/16 :goto_0

    .line 480
    .line 481
    :cond_a
    :goto_8
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 482
    .line 483
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 484
    .line 485
    .line 486
    iget-object v0, v0, Luh3;->Y:Lsh3;

    .line 487
    .line 488
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    const-string v4, "[sgtm] Completed client-side batch upload work. total, success"

    .line 497
    .line 498
    invoke-virtual {v0, v2, v4, v3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    :try_start_4
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/zzcx;->zze()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_3

    .line 502
    .line 503
    .line 504
    goto :goto_9

    .line 505
    :catch_3
    move-exception v0

    .line 506
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 507
    .line 508
    invoke-static {v1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    iget-object v1, v1, Lij3;->f:Luh3;

    .line 512
    .line 513
    invoke-static {v1}, Lij3;->l(Lhk3;)V

    .line 514
    .line 515
    .line 516
    iget-object v1, v1, Luh3;->w:Lsh3;

    .line 517
    .line 518
    const-string v2, "Failed to call IDynamiteUploadBatchesCallback"

    .line 519
    .line 520
    invoke-virtual {v1, v0, v2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    :goto_9
    return-void

    .line 524
    :cond_b
    invoke-static {v4}, Lij3;->l(Lhk3;)V

    .line 525
    .line 526
    .line 527
    iget-object v0, v4, Luh3;->f:Lsh3;

    .line 528
    .line 529
    const-string v1, "Cannot retrieve and upload batches from main thread"

    .line 530
    .line 531
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :cond_c
    iget-object v0, v3, Lij3;->f:Luh3;

    .line 536
    .line 537
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 538
    .line 539
    .line 540
    iget-object v0, v0, Luh3;->f:Lsh3;

    .line 541
    .line 542
    const-string v1, "Cannot retrieve and upload batches from analytics worker thread"

    .line 543
    .line 544
    invoke-virtual {v0, v1}, Lsh3;->a(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    return-void
.end method

.method public setConditionalUserProperty(Landroid/os/Bundle;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 9
    .line 10
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Luh3;->f:Lsh3;

    .line 14
    .line 15
    const-string p1, "Conditional user property must not be null"

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 22
    .line 23
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lsl3;->M(Landroid/os/Bundle;J)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setConsent(Landroid/os/Bundle;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    return-void
.end method

.method public setConsentThirdParty(Landroid/os/Bundle;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    const/16 v0, -0x14

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, p2, p3}, Lsl3;->S(Landroid/os/Bundle;IJ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setCurrentScreen(Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzdf;->zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/measurement/zzdf;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v0, p0

    .line 18
    move-object v2, p2

    .line 19
    move-object v3, p3

    .line 20
    move-wide v4, p4

    .line 21
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->setCurrentScreenByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setCurrentScreenByScionActivityInfo(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->W:Llm3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p4, p0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p4, Lij3;

    .line 14
    .line 15
    iget-object p5, p4, Lij3;->d:Lpd3;

    .line 16
    .line 17
    invoke-virtual {p5}, Lpd3;->N()Z

    .line 18
    .line 19
    .line 20
    move-result p5

    .line 21
    if-nez p5, :cond_0

    .line 22
    .line 23
    iget-object p0, p4, Lij3;->f:Luh3;

    .line 24
    .line 25
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 29
    .line 30
    const-string p1, "setCurrentScreen cannot be called while screen reporting is disabled."

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p5, p0, Llm3;->c:Lbm3;

    .line 37
    .line 38
    if-nez p5, :cond_1

    .line 39
    .line 40
    iget-object p0, p4, Lij3;->f:Luh3;

    .line 41
    .line 42
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 46
    .line 47
    const-string p1, "setCurrentScreen cannot be called while no activity active"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    iget-object v0, p0, Llm3;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 54
    .line 55
    iget v1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zza:I

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    iget-object p0, p4, Lij3;->f:Luh3;

    .line 68
    .line 69
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 73
    .line 74
    const-string p1, "setCurrentScreen must be called with an activity in the activity lifecycle"

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    if-nez p3, :cond_3

    .line 81
    .line 82
    iget-object p3, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p0, p3}, Llm3;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    :cond_3
    iget-object v2, p5, Lbm3;->b:Ljava/lang/String;

    .line 89
    .line 90
    iget-object p5, p5, Lbm3;->a:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v2, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-static {p5, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    if-nez p5, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    iget-object p0, p4, Lij3;->f:Luh3;

    .line 106
    .line 107
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 111
    .line 112
    const-string p1, "setCurrentScreen cannot be called with the same class and name"

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    :goto_0
    const/16 p5, 0x1f4

    .line 119
    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-lez v2, :cond_6

    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    iget-object v3, p4, Lij3;->d:Lpd3;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    if-gt v2, p5, :cond_6

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    iget-object p0, p4, Lij3;->f:Luh3;

    .line 141
    .line 142
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 143
    .line 144
    .line 145
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    const-string p2, "Invalid screen name length in setCurrentScreen. Length"

    .line 152
    .line 153
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_7
    :goto_1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-lez v2, :cond_9

    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    iget-object v3, p4, Lij3;->d:Lpd3;

    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    if-gt v2, p5, :cond_9

    .line 177
    .line 178
    iget-object p5, p4, Lij3;->f:Luh3;

    .line 179
    .line 180
    invoke-static {p5}, Lij3;->l(Lhk3;)V

    .line 181
    .line 182
    .line 183
    iget-object p5, p5, Luh3;->Y:Lsh3;

    .line 184
    .line 185
    if-nez p2, :cond_8

    .line 186
    .line 187
    const-string v2, "null"

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_8
    move-object v2, p2

    .line 191
    :goto_2
    const-string v3, "Setting current screen to name, class"

    .line 192
    .line 193
    invoke-virtual {p5, v2, v3, p3}, Lsh3;->c(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    new-instance p5, Lbm3;

    .line 197
    .line 198
    iget-object p4, p4, Lij3;->w:Lup3;

    .line 199
    .line 200
    invoke-static {p4}, Lij3;->j(Lsq3;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p4}, Lup3;->v0()J

    .line 204
    .line 205
    .line 206
    move-result-wide v2

    .line 207
    invoke-direct {p5, p2, v2, v3, p3}, Lbm3;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1, p5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->zzb:Ljava/lang/String;

    .line 214
    .line 215
    const/4 p2, 0x1

    .line 216
    invoke-virtual {p0, p1, p5, p2}, Llm3;->I(Ljava/lang/String;Lbm3;Z)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_9
    iget-object p0, p4, Lij3;->f:Luh3;

    .line 221
    .line 222
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 223
    .line 224
    .line 225
    iget-object p0, p0, Luh3;->V:Lsh3;

    .line 226
    .line 227
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    const-string p2, "Invalid class name length in setCurrentScreen. Length"

    .line 232
    .line 233
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p0, p1, p2}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    return-void
.end method

.method public setDataCollectionEnabled(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lwg3;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lij3;

    .line 17
    .line 18
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 19
    .line 20
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lsc;

    .line 24
    .line 25
    invoke-direct {v1, p0, p1}, Lsc;-><init>(Lsl3;Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public setDefaultEventParameters(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_0
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lij3;

    .line 28
    .line 29
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 30
    .line 31
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lhl3;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, p1, v2}, Lhl3;-><init>(Lsl3;Landroid/os/Bundle;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lwe2;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1, p0, p1}, Lwe2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 12
    .line 13
    iget-object p1, p1, Lij3;->i:Lbj3;

    .line 14
    .line 15
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lbj3;->F()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object p0, v1, Lij3;->X:Lsl3;

    .line 28
    .line 29
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Leg3;->y()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lwg3;->A()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lsl3;->d:Lqk3;

    .line 39
    .line 40
    if-eq v0, p1, :cond_1

    .line 41
    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    :cond_0
    const-string p1, "EventInterceptor already set."

    .line 46
    .line 47
    invoke-static {p1, v2}, Lkb1;->p(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    :cond_1
    iput-object v0, p0, Lsl3;->d:Lqk3;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    iget-object p1, v1, Lij3;->i:Lbj3;

    .line 54
    .line 55
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lol3;

    .line 59
    .line 60
    invoke-direct {v1, v2, p0, v0}, Lol3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setInstanceIdProvider(Lcom/google/android/gms/internal/measurement/zzdc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setMeasurementEnabled(ZJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0}, Lwg3;->A()V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lsq3;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Lij3;

    .line 21
    .line 22
    iget-object p2, p2, Lij3;->i:Lbj3;

    .line 23
    .line 24
    invoke-static {p2}, Lij3;->l(Lhk3;)V

    .line 25
    .line 26
    .line 27
    new-instance p3, Lcp0;

    .line 28
    .line 29
    const/16 v0, 0x1d

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {p3, p0, p1, v0, v1}, Lcp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p3}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public setMinimumSessionDuration(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setSessionTimeoutDuration(J)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lij3;

    .line 14
    .line 15
    iget-object v0, v0, Lij3;->i:Lbj3;

    .line 16
    .line 17
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lzk3;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v1, p0, p1, p2, v2}, Lzk3;-><init>(Lsl3;JI)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setSgtmDebugInfo(Landroid/content/Intent;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lij3;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 22
    .line 23
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Luh3;->W:Lsh3;

    .line 27
    .line 28
    const-string p1, "Activity intent has no data. Preview Mode was not enabled."

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string v0, "sgtm_debug_enable"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    const-string v1, "1"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string v0, "sgtm_preview_key"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    iget-object v0, p0, Lij3;->f:Luh3;

    .line 64
    .line 65
    invoke-static {v0}, Lij3;->l(Lhk3;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Luh3;->W:Lsh3;

    .line 69
    .line 70
    const-string v1, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: "

    .line 71
    .line 72
    invoke-virtual {v0, p1, v1}, Lsh3;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lij3;->d:Lpd3;

    .line 76
    .line 77
    iput-object p1, p0, Lpd3;->c:Ljava/lang/String;

    .line 78
    .line 79
    :cond_2
    return-void

    .line 80
    :cond_3
    :goto_0
    iget-object p1, p0, Lij3;->f:Luh3;

    .line 81
    .line 82
    invoke-static {p1}, Lij3;->l(Lhk3;)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p1, Luh3;->W:Lsh3;

    .line 86
    .line 87
    const-string v0, "[sgtm] Preview Mode was not enabled."

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Lsh3;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lij3;->d:Lpd3;

    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    iput-object p1, p0, Lpd3;->c:Ljava/lang/String;

    .line 96
    .line 97
    return-void
.end method

.method public setUserId(Ljava/lang/String;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 5
    .line 6
    iget-object v0, p0, Lij3;->X:Lsl3;

    .line 7
    .line 8
    invoke-static {v0}, Lij3;->k(Lwg3;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, v0, Lsq3;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lij3;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 24
    .line 25
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 29
    .line 30
    const-string p1, "User ID must be non-empty or null"

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p0, p0, Lij3;->i:Lbj3;

    .line 37
    .line 38
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lpl3;

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-direct {v1, v2, v0, p1}, Lpl3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lbj3;->I(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    const-string v2, "_id"

    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    const/4 v1, 0x0

    .line 54
    move-object v3, p1

    .line 55
    move-wide v5, p2

    .line 56
    invoke-virtual/range {v0 .. v6}, Lsl3;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/dynamic/IObjectWrapper;ZJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 9
    .line 10
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 11
    .line 12
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p6}, Lsl3;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public unregisterOnMeasurementEventListener(Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->b:Lid;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/zzda;->zzf()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lle2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lrk3;

    .line 20
    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lfq3;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, Lfq3;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->a:Lij3;

    .line 30
    .line 31
    iget-object p0, p0, Lij3;->X:Lsl3;

    .line 32
    .line 33
    invoke-static {p0}, Lij3;->k(Lwg3;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lwg3;->A()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lsl3;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    iget-object p0, p0, Lsq3;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lij3;

    .line 50
    .line 51
    iget-object p0, p0, Lij3;->f:Luh3;

    .line 52
    .line 53
    invoke-static {p0}, Lij3;->l(Lhk3;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Luh3;->w:Lsh3;

    .line 57
    .line 58
    const-string p1, "OnEventListener had not been registered"

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lsh3;->a(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p0
.end method
