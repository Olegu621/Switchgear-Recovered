.class public abstract Lz2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lh9;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lva3;

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-direct {v1, v2}, Lva3;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lh9;

    .line 13
    .line 14
    const-string v3, "ActivityRecognition.API"

    .line 15
    .line 16
    invoke-direct {v2, v3, v1, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 17
    .line 18
    .line 19
    sput-object v2, Lz2;->a:Lh9;

    .line 20
    .line 21
    new-instance v0, Lcom/google/android/gms/internal/location/zzg;

    .line 22
    .line 23
    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzg;-><init>()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
