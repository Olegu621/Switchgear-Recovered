.class public abstract Lf6;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljr1;

.field public static final b:Lir1;

.field public static final c:Lt31;

.field public static final d:Lp31;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 2
    .line 3
    invoke-static {v0}, Lp13;->b(Ljava/lang/String;)Lwl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljr1;

    .line 8
    .line 9
    const-class v2, Le6;

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljr1;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lf6;->a:Ljr1;

    .line 15
    .line 16
    new-instance v1, Lir1;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lir1;-><init>(Lwl;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lf6;->b:Lir1;

    .line 22
    .line 23
    new-instance v1, Lt31;

    .line 24
    .line 25
    const-class v2, Lb6;

    .line 26
    .line 27
    invoke-direct {v1, v2}, Lt31;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lf6;->c:Lt31;

    .line 31
    .line 32
    new-instance v1, Ln4;

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    invoke-direct {v1, v2}, Ln4;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lp31;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, Lp31;-><init>(Lwl;Lq31;)V

    .line 41
    .line 42
    .line 43
    sput-object v2, Lf6;->d:Lp31;

    .line 44
    .line 45
    return-void
.end method
