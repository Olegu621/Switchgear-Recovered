.class public final Lp02;
.super Lcom/google/android/material/datepicker/g;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic U:Ldd1;

.field public final synthetic V:Lcom/google/android/material/datepicker/RangeDateSelector;

.field public final synthetic i:I

.field public final synthetic v:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic w:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/RangeDateSelector;Ljava/lang/String;Ljava/text/SimpleDateFormat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ldd1;I)V
    .locals 0

    .line 1
    iput p9, p0, Lp02;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lp02;->V:Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 4
    .line 5
    iput-object p6, p0, Lp02;->v:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    iput-object p7, p0, Lp02;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    iput-object p8, p0, Lp02;->U:Ldd1;

    .line 10
    .line 11
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/material/datepicker/g;-><init>(Ljava/lang/String;Ljava/text/SimpleDateFormat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/datepicker/CalendarConstraints;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, Lp02;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lp02;->U:Ldd1;

    .line 4
    .line 5
    iget-object v2, p0, Lp02;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    iget-object v3, p0, Lp02;->v:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, Lp02;->V:Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iput-object v4, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->e:Ljava/lang/Long;

    .line 16
    .line 17
    invoke-static {p0, v3, v2, v1}, Lcom/google/android/material/datepicker/RangeDateSelector;->a(Lcom/google/android/material/datepicker/RangeDateSelector;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ldd1;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iput-object v4, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->d:Ljava/lang/Long;

    .line 22
    .line 23
    invoke-static {p0, v3, v2, v1}, Lcom/google/android/material/datepicker/RangeDateSelector;->a(Lcom/google/android/material/datepicker/RangeDateSelector;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ldd1;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Long;)V
    .locals 4

    .line 1
    iget v0, p0, Lp02;->i:I

    .line 2
    .line 3
    iget-object v1, p0, Lp02;->U:Ldd1;

    .line 4
    .line 5
    iget-object v2, p0, Lp02;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    iget-object v3, p0, Lp02;->v:Lcom/google/android/material/textfield/TextInputLayout;

    .line 8
    .line 9
    iget-object p0, p0, Lp02;->V:Lcom/google/android/material/datepicker/RangeDateSelector;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->e:Ljava/lang/Long;

    .line 15
    .line 16
    invoke-static {p0, v3, v2, v1}, Lcom/google/android/material/datepicker/RangeDateSelector;->a(Lcom/google/android/material/datepicker/RangeDateSelector;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ldd1;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iput-object p1, p0, Lcom/google/android/material/datepicker/RangeDateSelector;->d:Ljava/lang/Long;

    .line 21
    .line 22
    invoke-static {p0, v3, v2, v1}, Lcom/google/android/material/datepicker/RangeDateSelector;->a(Lcom/google/android/material/datepicker/RangeDateSelector;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Ldd1;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
