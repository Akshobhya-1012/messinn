import { configureStore } from '@reduxjs/toolkit'

// get the slice for auth
import authSlice from './UserPages/Slice/authslice'

// create a store with required reducers
const store = configureStore({
  reducer: {
    authSlice,
  },
})

export default store
