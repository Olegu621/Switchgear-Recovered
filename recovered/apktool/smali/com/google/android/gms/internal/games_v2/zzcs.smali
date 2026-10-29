.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzcs;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzaq;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:I

.field public final synthetic zzc:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzcs;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/games_v2/zzcs;->zzb:I

    .line 7
    .line 8
    iput p3, p0, Lcom/google/android/gms/internal/games_v2/zzcs;->zzc:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final zza(Lor0;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzcs;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/games_v2/zzcs;->zzb:I

    .line 4
    .line 5
    iget p0, p0, Lcom/google/android/gms/internal/games_v2/zzcs;->zzc:I

    .line 6
    .line 7
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Lcom/google/android/gms/internal/games_v2/zzdb;

    .line 12
    .line 13
    invoke-direct {v3, v0, v1, p0}, Lcom/google/android/gms/internal/games_v2/zzdb;-><init>(Ljava/lang/String;II)V

    .line 14
    .line 15
    .line 16
    iput-object v3, v2, Ltm2;->a:Lc32;

    .line 17
    .line 18
    const/16 p0, 0x1a2f

    .line 19
    .line 20
    iput p0, v2, Ltm2;->d:I

    .line 21
    .line 22
    invoke-virtual {v2}, Ltm2;->a()Lmb3;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1, p0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
