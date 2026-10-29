.class public final Loi0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final b:F


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    .line 1
    iput p2, p0, Loi0;->a:I

    .line 2
    .line 3
    iput p1, p0, Loi0;->b:F

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Loi0;->a:I

    .line 2
    .line 3
    iget p0, p0, Loi0;->b:F

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lni0;

    .line 9
    .line 10
    check-cast p2, Lni0;

    .line 11
    .line 12
    iget p2, p2, Lni0;->c:F

    .line 13
    .line 14
    sub-float/2addr p2, p0

    .line 15
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget p1, p1, Lni0;->c:F

    .line 20
    .line 21
    sub-float/2addr p1, p0

    .line 22
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p2, p0}, Ljava/lang/Float;->compare(FF)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :pswitch_0
    check-cast p1, Lni0;

    .line 32
    .line 33
    check-cast p2, Lni0;

    .line 34
    .line 35
    iget v0, p2, Lni0;->d:I

    .line 36
    .line 37
    iget v1, p1, Lni0;->d:I

    .line 38
    .line 39
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    iget p1, p1, Lni0;->c:F

    .line 46
    .line 47
    sub-float/2addr p1, p0

    .line 48
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget p2, p2, Lni0;->c:F

    .line 53
    .line 54
    sub-float/2addr p2, p0

    .line 55
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    :cond_0
    return v0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
