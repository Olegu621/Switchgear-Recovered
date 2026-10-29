.class public final Lcom/google/android/gms/games/zzv;
.super Lio3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/games/PlayerRelationshipInfo;


# instance fields
.field public final d:Lnf3;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;ILnf3;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lz30;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/games/zzv;->d:Lnf3;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/gms/games/zzt;->E1(Lcom/google/android/gms/games/PlayerRelationshipInfo;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final synthetic freeze()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/games/zzt;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/games/zzt;-><init>(Lcom/google/android/gms/games/PlayerRelationshipInfo;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/games/zzv;->z()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/google/android/gms/games/zzv;->zzb()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lcom/google/android/gms/games/zzv;->zza()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lcom/google/android/gms/games/zzv;->zzc()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/games/zzt;->D1(Lcom/google/android/gms/games/PlayerRelationshipInfo;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    new-instance p2, Lcom/google/android/gms/games/zzt;

    .line 2
    .line 3
    invoke-direct {p2, p0}, Lcom/google/android/gms/games/zzt;-><init>(Lcom/google/android/gms/games/PlayerRelationshipInfo;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p1}, Ldr3;->a(Lcom/google/android/gms/games/zzt;Landroid/os/Parcel;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final z()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/games/zzv;->d:Lnf3;

    .line 2
    .line 3
    iget-object v0, v0, Lnf3;->G:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lz30;->r(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lz30;->u(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Lz30;->d(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, -0x1

    .line 24
    return p0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/games/zzv;->d:Lnf3;

    .line 2
    .line 3
    iget-object v0, v0, Lnf3;->I:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio3;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/games/zzv;->d:Lnf3;

    .line 2
    .line 3
    iget-object v0, v0, Lnf3;->H:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio3;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/games/zzv;->d:Lnf3;

    .line 2
    .line 3
    iget-object v0, v0, Lnf3;->J:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio3;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
