.class public final Lhe0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final b:Lhe0;

.field public static final c:Lhe0;


# instance fields
.field public final a:Lge0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lhe0;

    .line 2
    .line 3
    new-instance v1, Lec0;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lhe0;->b:Lhe0;

    .line 13
    .line 14
    new-instance v0, Lhe0;

    .line 15
    .line 16
    new-instance v1, Lec0;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lhe0;->c:Lhe0;

    .line 26
    .line 27
    new-instance v0, Lhe0;

    .line 28
    .line 29
    new-instance v1, Lec0;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lhe0;

    .line 39
    .line 40
    new-instance v1, Lzb0;

    .line 41
    .line 42
    invoke-direct {v1, v2}, Lzb0;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lhe0;

    .line 49
    .line 50
    new-instance v1, Lzb0;

    .line 51
    .line 52
    const/4 v2, 0x3

    .line 53
    invoke-direct {v1, v2}, Lzb0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 57
    .line 58
    .line 59
    new-instance v0, Lhe0;

    .line 60
    .line 61
    new-instance v1, Lzb0;

    .line 62
    .line 63
    const/4 v2, 0x4

    .line 64
    invoke-direct {v1, v2}, Lzb0;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lhe0;

    .line 71
    .line 72
    new-instance v1, Lec0;

    .line 73
    .line 74
    const/4 v2, 0x3

    .line 75
    invoke-direct {v1, v2}, Lec0;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1}, Lhe0;-><init>(Lie0;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>(Lie0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lto2;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ld52;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ld52;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lhe0;->a:Lge0;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "java.vendor"

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "The Android Project"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Lgr0;

    .line 33
    .line 34
    invoke-direct {v0, p1}, Lgr0;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lhe0;->a:Lge0;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance v0, Lqc3;

    .line 41
    .line 42
    const/16 v1, 0x17

    .line 43
    .line 44
    invoke-direct {v0, p1, v1}, Lqc3;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lhe0;->a:Lge0;

    .line 48
    .line 49
    return-void
.end method
