.class public final Lcom/google/android/gms/internal/location/zzaf;
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
.method public final addGeofences(Ltr0;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/location/GeofencingRequest;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 71
    new-instance v0, Lcom/google/android/gms/internal/location/zzac;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/location/zzac;-><init>(Lcom/google/android/gms/internal/location/zzaf;Ltr0;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)V

    check-cast p1, Leb3;

    .line 72
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 73
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    move-result-object p0

    return-object p0
.end method

.method public final addGeofences(Ltr0;Ljava/util/List;Landroid/app/PendingIntent;)Lsr1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/location/zzbe;",
            ">;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/google/android/gms/internal/location/zzbe;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    xor-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    const-string v1, "No geofence has been added to this request."

    .line 44
    .line 45
    invoke-static {v1, p2}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    new-instance p2, Lcom/google/android/gms/location/GeofencingRequest;

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    const/4 v2, 0x5

    .line 52
    const-string v3, ""

    .line 53
    .line 54
    invoke-direct {p2, v0, v2, v3, v1}, Lcom/google/android/gms/location/GeofencingRequest;-><init>(Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lcom/google/android/gms/internal/location/zzac;

    .line 58
    .line 59
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/location/zzac;-><init>(Lcom/google/android/gms/internal/location/zzaf;Ltr0;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)V

    .line 60
    .line 61
    .line 62
    check-cast p1, Leb3;

    .line 63
    .line 64
    iget-object p0, p1, Leb3;->b:Lor0;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lor0;->doWrite(Lgi;)Lgi;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public final removeGeofences(Ltr0;Landroid/app/PendingIntent;)Lsr1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Landroid/app/PendingIntent;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 30
    const-string v0, "PendingIntent can not be null."

    .line 31
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/location/zzbq;

    const/4 v1, 0x0

    const-string v2, ""

    .line 32
    invoke-direct {v0, v1, p2, v2}, Lcom/google/android/gms/location/zzbq;-><init>(Ljava/util/List;Landroid/app/PendingIntent;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/location/zzaf;->zza(Ltr0;Lcom/google/android/gms/location/zzbq;)Lsr1;

    move-result-object p0

    return-object p0
.end method

.method public final removeGeofences(Ltr0;Ljava/util/List;)Lsr1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lsr1;"
        }
    .end annotation

    .line 1
    const-string v0, "geofence can\'t be null."

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    xor-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    const-string v1, "Geofences must contains at least one id."

    .line 13
    .line 14
    invoke-static {v1, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lcom/google/android/gms/location/zzbq;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const-string v2, ""

    .line 21
    .line 22
    invoke-direct {v0, p2, v1, v2}, Lcom/google/android/gms/location/zzbq;-><init>(Ljava/util/List;Landroid/app/PendingIntent;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/location/zzaf;->zza(Ltr0;Lcom/google/android/gms/location/zzbq;)Lsr1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final zza(Ltr0;Lcom/google/android/gms/location/zzbq;)Lsr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltr0;",
            "Lcom/google/android/gms/location/zzbq;",
            ")",
            "Lsr1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/location/zzad;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/location/zzad;-><init>(Lcom/google/android/gms/internal/location/zzaf;Ltr0;Lcom/google/android/gms/location/zzbq;)V

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
