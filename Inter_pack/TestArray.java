package Inter_pack;

public class TestArray implements Array{
	int a[] = new int[500];
	int size = 0;

	@Override
	public int Get(int i){
		if (i >= 0){
			return a[i];
		} else{
			if (size + i >= 0)
				return a[size + i];
			else 
				return 404;
		}
	}

	@Override
	public boolean Add(int val){
		if (size != a.length){
			a[size] = val;
			size++;
			return true;
		} else
			return false;
	}
}