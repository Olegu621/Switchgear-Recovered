.class public abstract Lce;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lh9;

.field public static final b:Lh9;

.field public static final c:Lcom/google/android/gms/internal/auth-api/zbl;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Le9;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Le9;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lva3;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {v2, v3}, Lva3;-><init>(I)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lva3;

    .line 18
    .line 19
    const/4 v4, 0x4

    .line 20
    invoke-direct {v3, v4}, Lva3;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sget-object v4, Lde;->a:Lh9;

    .line 24
    .line 25
    new-instance v4, Lh9;

    .line 26
    .line 27
    const-string v5, "Auth.CREDENTIALS_API"

    .line 28
    .line 29
    invoke-direct {v4, v5, v2, v0}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 30
    .line 31
    .line 32
    sput-object v4, Lce;->a:Lh9;

    .line 33
    .line 34
    new-instance v0, Lh9;

    .line 35
    .line 36
    const-string v2, "Auth.GOOGLE_SIGN_IN_API"

    .line 37
    .line 38
    invoke-direct {v0, v2, v3, v1}, Lh9;-><init>(Ljava/lang/String;Lw8;Le9;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lce;->b:Lh9;

    .line 42
    .line 43
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbl;

    .line 44
    .line 45
    invoke-direct {v0}, Lcom/google/android/gms/internal/auth-api/zbl;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lce;->c:Lcom/google/android/gms/internal/auth-api/zbl;

    .line 49
    .line 50
    return-void
.end method
