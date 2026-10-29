.class public final Lzu;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:F

.field public b:F

.field public c:F


# direct methods
.method public constructor <init>(FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzu;->a:F

    .line 5
    .line 6
    iput p2, p0, Lzu;->b:F

    .line 7
    .line 8
    iput p3, p0, Lzu;->c:F

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lzu;)V
    .locals 2

    .line 11
    iget v0, p1, Lzu;->a:F

    iget v1, p1, Lzu;->b:F

    iget p1, p1, Lzu;->c:F

    invoke-direct {p0, v0, v1, p1}, Lzu;-><init>(FFF)V

    return-void
.end method
