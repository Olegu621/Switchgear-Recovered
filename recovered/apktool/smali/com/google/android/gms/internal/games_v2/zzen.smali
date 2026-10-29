.class public final synthetic Lcom/google/android/gms/internal/games_v2/zzen;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/gms/internal/games_v2/zzaq;


# static fields
.field public static final synthetic zza:Lcom/google/android/gms/internal/games_v2/zzen;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/games_v2/zzen;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/games_v2/zzen;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/games_v2/zzen;->zza:Lcom/google/android/gms/internal/games_v2/zzen;

    .line 7
    .line 8
    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final zza(Lor0;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    invoke-static {}, Lum2;->builder()Ltm2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/google/android/gms/internal/games_v2/zzev;->zza:Lcom/google/android/gms/internal/games_v2/zzev;

    .line 6
    .line 7
    iput-object v0, p0, Ltm2;->a:Lc32;

    .line 8
    .line 9
    const/16 v0, 0x1a3e

    .line 10
    .line 11
    iput v0, p0, Ltm2;->d:I

    .line 12
    .line 13
    invoke-virtual {p0}, Ltm2;->a()Lmb3;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1, p0}, Lor0;->doRead(Lum2;)Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
