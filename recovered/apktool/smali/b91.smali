.class public abstract Lb91;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(Lg71;)Le91;
    .locals 2

    .line 1
    new-instance v0, Le91;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Lu33;

    .line 5
    .line 6
    invoke-interface {v1}, Lu33;->getViewModelStore()Lt33;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, p0, v1}, Le91;-><init>(Lg71;Lt33;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
