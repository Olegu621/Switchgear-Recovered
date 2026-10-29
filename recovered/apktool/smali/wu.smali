.class public final Lwu;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# static fields
.field public static final b:Lwu;


# instance fields
.field public final a:Lzu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lwu;

    .line 2
    .line 3
    invoke-direct {v0}, Lwu;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwu;->b:Lwu;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzu;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lwu;->a:Lzu;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p2, Lzu;

    .line 2
    .line 3
    check-cast p3, Lzu;

    .line 4
    .line 5
    iget v0, p2, Lzu;->a:F

    .line 6
    .line 7
    iget v1, p3, Lzu;->a:F

    .line 8
    .line 9
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    sub-float/2addr v2, p1

    .line 12
    mul-float/2addr v0, v2

    .line 13
    mul-float/2addr v1, p1

    .line 14
    add-float/2addr v1, v0

    .line 15
    iget v0, p2, Lzu;->b:F

    .line 16
    .line 17
    iget v3, p3, Lzu;->b:F

    .line 18
    .line 19
    mul-float/2addr v0, v2

    .line 20
    mul-float/2addr v3, p1

    .line 21
    add-float/2addr v3, v0

    .line 22
    iget p2, p2, Lzu;->c:F

    .line 23
    .line 24
    iget p3, p3, Lzu;->c:F

    .line 25
    .line 26
    mul-float/2addr v2, p2

    .line 27
    mul-float/2addr p1, p3

    .line 28
    add-float/2addr p1, v2

    .line 29
    iget-object p0, p0, Lwu;->a:Lzu;

    .line 30
    .line 31
    iput v1, p0, Lzu;->a:F

    .line 32
    .line 33
    iput v3, p0, Lzu;->b:F

    .line 34
    .line 35
    iput p1, p0, Lzu;->c:F

    .line 36
    .line 37
    return-object p0
.end method
