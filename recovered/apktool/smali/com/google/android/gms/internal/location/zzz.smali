.class public final Lcom/google/android/gms/internal/location/zzz;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final flushLocations(Ltr0;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzq;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/location/zzq;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Leb3;

    .line 7
    .line 8
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final getLastLocation(Ltr0;)Landroid/location/Location;
    .locals 1

    .line 1
    sget-object p0, Lq91;->a:Lh9;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    :goto_0
    const-string v0, "GoogleApiClient parameter is required."

    .line 9
    .line 10
    invoke-static {v0, p0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public final getLocationAvailability(Ltr0;)Lcom/google/android/gms/location/LocationAvailability;
    .locals 1

    .line 1
    sget-object p0, Lq91;->a:Lh9;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    :goto_0
    const-string v0, "GoogleApiClient parameter is required."

    .line 9
    .line 10
    invoke-static {v0, p0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public final removeLocationUpdates(Ltr0;Landroid/app/PendingIntent;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzw;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzw;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Landroid/app/PendingIntent;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Leb3;

    .line 7
    .line 8
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final removeLocationUpdates(Ltr0;Lm91;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lm91;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 15
    new-instance v0, Lcom/google/android/gms/internal/location/zzn;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzn;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Lm91;)V

    check-cast p1, Leb3;

    .line 16
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 17
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    move-result-object p0

    return-object p0
.end method

.method public final removeLocationUpdates(Ltr0;Ln91;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Ln91;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 18
    new-instance v0, Lcom/google/android/gms/internal/location/zzv;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzv;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Ln91;)V

    check-cast p1, Leb3;

    .line 19
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 20
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    move-result-object p0

    return-object p0
.end method

.method public final requestLocationUpdates(Ltr0;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 27
    new-instance v0, Lcom/google/android/gms/internal/location/zzu;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/location/zzu;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Lcom/google/android/gms/location/LocationRequest;Landroid/app/PendingIntent;)V

    check-cast p1, Leb3;

    .line 28
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 29
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    move-result-object p0

    return-object p0
.end method

.method public final requestLocationUpdates(Ltr0;Lcom/google/android/gms/location/LocationRequest;Lm91;Landroid/os/Looper;)Lsr1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Lm91;",
            "Landroid/os/Looper;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 24
    new-instance v0, Lcom/google/android/gms/internal/location/zzt;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/location/zzt;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Lcom/google/android/gms/location/LocationRequest;Lm91;Landroid/os/Looper;)V

    move-object p1, v2

    check-cast p1, Leb3;

    .line 25
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 26
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    move-result-object p0

    return-object p0
.end method

.method public final requestLocationUpdates(Ltr0;Lcom/google/android/gms/location/LocationRequest;Ln91;)Lsr1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Ln91;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Calling thread must be a prepared Looper thread."

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/location/zzr;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/location/zzr;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Lcom/google/android/gms/location/LocationRequest;Ln91;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, Leb3;

    .line 16
    .line 17
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final requestLocationUpdates(Ltr0;Lcom/google/android/gms/location/LocationRequest;Ln91;Landroid/os/Looper;)Lsr1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/location/LocationRequest;",
            "Ln91;",
            "Landroid/os/Looper;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 30
    new-instance v0, Lcom/google/android/gms/internal/location/zzs;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/location/zzs;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Lcom/google/android/gms/location/LocationRequest;Ln91;Landroid/os/Looper;)V

    move-object p1, v2

    check-cast p1, Leb3;

    .line 31
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 32
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    move-result-object p0

    return-object p0
.end method

.method public final setMockLocation(Ltr0;Landroid/location/Location;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Landroid/location/Location;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzp;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzp;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Landroid/location/Location;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Leb3;

    .line 7
    .line 8
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final setMockMode(Ltr0;Z)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Z)",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzo;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzo;-><init>(Lcom/google/android/gms/internal/location/zzz;Ltr0;Z)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Leb3;

    .line 7
    .line 8
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method
