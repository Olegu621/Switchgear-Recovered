.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzci;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzaq;


# instance fields
.field public final synthetic zza:Ljava/lang/String;

.field public final synthetic zzb:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/games_v2/zzci;->zza:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/internal/games_v2/zzci;->zzb:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final zza(Lor0;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/games_v2/zzci;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/gms/internal/games_v2/zzci;->zzb:I

    .line 4
    .line 5
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/google/android/gms/internal/games_v2/zzcf;

    .line 10
    .line 11
    invoke-direct {v2, v0, p0}, Lcom/google/android/gms/internal/games_v2/zzcf;-><init>(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    iput-object v2, v1, Ltm2;->a:Lc32;

    .line 15
    .line 16
    const/16 p0, 0x1a49

    .line 17
    .line 18
    iput p0, v1, Ltm2;->d:I

    .line 19
    .line 20
    invoke-virtual {v1}, Ltm2;->a()Lmb3;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p1, p0}, Lor0;->doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
