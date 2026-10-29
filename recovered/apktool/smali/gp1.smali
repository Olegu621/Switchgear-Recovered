.class public final Lgp1;
.super Ldc0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a0:Lpc1;

.field public final b0:F


# direct methods
.method public constructor <init>(Lpc1;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ldc0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lgp1;->a0:Lpc1;

    .line 6
    .line 7
    iput p2, p0, Lgp1;->b0:F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final h(FFFLdd2;)V
    .locals 1

    .line 1
    iget v0, p0, Lgp1;->b0:F

    .line 2
    .line 3
    sub-float/2addr p2, v0

    .line 4
    iget-object p0, p0, Lgp1;->a0:Lpc1;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lpc1;->h(FFFLdd2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
